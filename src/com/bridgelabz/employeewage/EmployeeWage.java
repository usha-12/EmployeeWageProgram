package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int TOTAL_WORKING_HOURS = 100;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static void computeEmployee() {

        int day = 1;
        int totalWorkingHours = 0;
        int totalWage = 0;
        while (day <= WORKING_DAY_PER_MONTH && totalWorkingHours <= TOTAL_WORKING_HOURS) {
            int dailyWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee FULL TIME");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    totalWorkingHours = totalWorkingHours + FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee PART TIME");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHours = totalWorkingHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("daily Wage => " + day + "=>" + dailyWage);
            day++;
        }
        System.out.println("=================================================");
        System.out.println("Total wage => " + totalWage);
        System.out.println("Total working hours => " + totalWorkingHours);
    }

    public static void main(String[] args) {
        System.out.println("Employee Wage Problem");
        computeEmployee();

    }
}
/*Refactor the Code
to write a Class
Method to Compute
Employee Wage - Use Class Method and Class
Variables*/