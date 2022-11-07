package uc11empwage;

    import java.util.Scanner;

public class EmpWageMain {
    public class empWageMain {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ch;

            uc10empwage.CompanyService cs = new uc10empwage.CompanyService();
            // running the while loop and calling the methods inside
            while (true) {
                System.out.println(" 1. Add company \n 2. Print Employee Details  \n 3. Print Company Wage \n 4. Exit");
                System.out.println(" Please enter your choice: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        cs.addCompany();
                        break;
                    case 2:
                        cs.printCompany();
                        break;
                    case 3:
                        cs.CompanyWage();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println(" Please enter valid input");
                        break;
                }
            }

        }

    }
}
