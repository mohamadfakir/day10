package uc9employeewages;

    import java.util.Random;

    public class TotalWageEachCompany {
        private static final int isFullTime = 1;
        private static final int isPartTime = 2;

        private String companyName;
        private int wagePerHr;
        private int WorkingDaysInMonth;
        private int maxWorkingHrs;

        /*
         * parameteraised constructor
         */
        TotalWageEachCompany(String companyName, int maxWorkingHrs, int WorkingDaysInMonth, int wagePerHr) {
            this.companyName = companyName;
            this.maxWorkingHrs = maxWorkingHrs;
            this.WorkingDaysInMonth = WorkingDaysInMonth;
            this.wagePerHr = wagePerHr;
        }

        public void totalEmpWage() {
            Random random = new Random();

            int totalWorkingHr = 0;
            int totalEmpWage = 0;
            int totalWorkingDays = 0;
            int empWage = 0;

            while (totalWorkingDays < WorkingDaysInMonth && totalWorkingHr < maxWorkingHrs) {
                totalWorkingDays++;

                int empCheck = random.nextInt(3);
                int empHrs = 0;

                switch (empCheck) {
                    case isFullTime:
                        empHrs = 8;
                        break;

                    case isPartTime:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                }

                totalWorkingHr = empHrs + totalWorkingHr;
                empWage = empHrs * wagePerHr;

                System.out.println("Day " + totalWorkingDays + " = " + empWage);
                totalEmpWage = empWage + totalEmpWage;
            }
            System.out.println("Salary of " + companyName + "Employee is " + totalEmpWage);
        }

        public static void main(String[] args) {

            /*
             * creating Object
             */
            TotalWageEachCompany Dmart = new TotalWageEachCompany(" Dmart ", 100, 20, 100);
            Dmart.totalEmpWage();
            TotalWageEachCompany Relaince = new TotalWageEachCompany(" Relaince ", 120, 25, 80);
            Relaince.totalEmpWage();
        }
    }

