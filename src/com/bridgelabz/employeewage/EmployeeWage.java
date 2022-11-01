package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String args[]) {
        computeEmpWage("Google", 50, 15, 200);
        computeEmpWage("Amazon", 80, 20, 120);
        computeEmpWage("Meta", 60, 20, 100);
        computeEmpWage("Netflix", 90, 18, 220);
        computeEmpWage("Tesla", 100, 20, 250);
    }

    public static void computeEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        for (totalWorkingDays = 1; totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays; totalWorkingDays++) {
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
            empWage = empHrs * empRatePerHour;
            totalEmpHrs += empHrs;
            //totalEmpWage += empWage;
            System.out.println("Day " + totalWorkingDays + "	Employee hours : " + empHrs + "	Wage $" + empWage);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println();
        System.out.println(companyName + " company Employee Monthly Wage : $" + totalEmpWage + "\n\n");
    }
}
/*Compute Employee Wage
for multiple companies - Note: Each Company has its own
wage, number of working days
and working hours per month
- Use Class Method with function
parameters instead of Class
Variables*/