package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numberOfCompanies = 0;
    private CompanyWage[] companyWageArray;
    public EmployeeWage() {
        companyWageArray = new CompanyWage[5];
    }
    public static void main(String args[]) {
        EmployeeWage wageCalculator = new EmployeeWage();
        wageCalculator.addCompany("Google", 50, 15, 200);
        wageCalculator.addCompany("Amazon", 80, 20, 120);
        wageCalculator.addCompany("Netflix", 90, 18, 220);
        wageCalculator.computeEmpWage();
    }
    private void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        companyWageArray[numberOfCompanies] = new CompanyWage(companyName, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
        numberOfCompanies++;
    }
    private void computeEmpWage() {
        for (int i = 0; i < numberOfCompanies; i++) {
            companyWageArray[i].setTotalEmpWage(this.computeEmpWage(companyWageArray[i]));
            System.out.println(companyWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyWage companyWage) {
        int empHrs = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        for (totalWorkingDays = 1; totalEmpHrs <= companyWage.maxHoursInMonth && totalWorkingDays < companyWage.numOfWorkingDays; totalWorkingDays++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is present Full time.");
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is present Part time.");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Employee is absent.");
            }
            empWage = empHrs * companyWage.empRatePerHour;
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + "	Employee hours : " + empHrs + "	Wage $" + empWage);
        }
        return (totalEmpHrs * companyWage.empRatePerHour);
    }
}
/*Ability to manage
Employee Wage of
multiple companies using
Interface approach - Note: Refactor to have one
EmpWageBuilder to implement
Interface*/