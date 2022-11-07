package uc11empwage;

    public class CompanyEmpWage {
        private int empWage = 0;
        private int days = 0;
        private int workHrs = 0;
        private String CompanyName;

        public CompanyEmpWage(int empWage, int days, int workHrs, String companyName) {
            this.empWage = empWage;
            this.days = days;
            this.workHrs = workHrs;
            CompanyName = companyName;
        }

        public int getEmpWage() {
            return empWage;
        }

        public void setEmpWage(int empWage) {
            this.empWage = empWage;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public int getWorkHrs() {
            return workHrs;
        }

        public void setWorkHrs(int workHrs) {
            this.workHrs = workHrs;
        }

        public String getCompanyName() {
            return CompanyName;
        }

        public void setCompanyName(String companyName) {
            this.CompanyName = companyName;
        }

        @Override
        public String toString() {
            return "CompanyEmpWage [empWage=" + empWage + ", days=" + days + ", workHrs=" + workHrs + ", CompanyName="
                    + CompanyName + "]";
        }

    }
