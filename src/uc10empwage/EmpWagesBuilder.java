package uc10empwage;

import java.util.ArrayList;
import java.util.Random;

    public class EmpWageBuilder {
        private static ArrayList<CompanyEmpWage> CompanyList = new ArrayList<CompanyEmpWage>();

        public static ArrayList<CompanyEmpWage> getCompanyList(){
            return CompanyList;
        }

        public void setCompanyList(ArrayList<CompanyEmpWage> companyList) {
            CompanyList = companyList;
        }

        public static void calEmployeeWage(CompanyEmpWage wage) {
            final int isPartTime = 1;
            final int isFullTime = 2;
            final int partTimeHrs = 4;
            final int fullTimeHrs = 8;

            int days = 0;
            int hours = 0;

            String name = wage.getCompanyName();
            int noOfDays = wage.getDays();
            int maxHrsMonth = wage.getWorkHrs();
            int wagePerHr = wage.getEmpWage();

            while( days <noOfDays && hours <maxHrsMonth) {
                Random random = new Random();
                int attendance = random.nextInt(3);

                if(hours + partTimeHrs > maxHrsMonth && hours + fullTimeHrs > maxHrsMonth) {
                    break;
                }

                switch (attendance) {

                    case isFullTime :
                        if(hours + fullTimeHrs >maxHrsMonth ) {
                            break;
                        }
                        hours += fullTimeHrs;
                        days++;
                        break;


                    case isPartTime :
                        if (hours + partTimeHrs > maxHrsMonth) {
                            break;
                        }
                        hours += partTimeHrs;
                        days++;
                        break;
                }
            }

            wage.setDays(days);
            wage.setWorkHrs(hours);
            wage.setEmpWage(hours * wagePerHr);
            System.out.println(wage);

        }
    }
