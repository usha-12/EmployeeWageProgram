package com.bridgelabz.employeewage;
public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String args[]) {

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {

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

            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Daily Wage : $" + empWage);
        }

        System.out.println();
        System.out.println("Employee Monthly Wage : $" + totalEmpWage);

    }
}
/*Calculating Wages
for a Month
- Assume 20 Working Day per Month*/