package uc11empwage;

import uc10empwage.CompanyEmpWage;
import uc10empwage.EmpWageBuilder;
import uc10empwage.EmployeeMethod;

import java.util.ArrayList;
import java.util.Scanner;

class CompanyService implements EmployeeMethod {
    ArrayList<uc10empwage.CompanyEmpWage> CompanyList = new ArrayList<uc10empwage.CompanyEmpWage>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addCompany() {
        uc10empwage.CompanyEmpWage w = getInfo();
        EmpWageBuilder.calEmployeeWage(w);
        CompanyList.add(w);
    }

    //Display Companies
    @Override
    public void printCompany() {
        System.out.println(CompanyList);

    }

    public uc10empwage.CompanyEmpWage getInfo() {


        System.out.print(" Please enter the wages per hour: ");
        int wagePerHour = sc.nextInt();

        System.out.print("\n\n Please enter the name of the company: ");
        String companyName = sc.next();

        System.out.print(" Please enter the max num of working days in a month: ");
        int maxWorkDays = sc.nextInt();

        System.out.print(" Please enter the max num of working hours in a month: ");
        int workingHrs = sc.nextInt();

        return new uc10empwage.CompanyEmpWage(wagePerHour, maxWorkDays, workingHrs, companyName);
    }


    public void CompanyWage() {
        System.out.println("Enter the Name of Company ");
        String cmnnyName = sc.next();

        for(CompanyEmpWage cmpnyEmpWage : CompanyList) {
            if(cmpnyEmpWage.getCompanyName().equals(cmnnyName)) { //Check if company name exist
                System.out.println(" Total wage of "+ cmnnyName + "is " +cmpnyEmpWage.getEmpWage()); //print wage for that company
            }
        }
        System.out.println(" Company of this name does not exist!");
    }



}

