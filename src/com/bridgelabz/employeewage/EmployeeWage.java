package com.bridgelabz.employeewage;
public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String args[]) {

        int empHrs = 0;
        int empWage = 0;
        int checkEmployee=0;
        switch (checkEmployee) {
            case IS_FULL_TIME :
                empHrs = 8;
                System.out.println("Employee is present Full time.");
                break;

            case IS_PART_TIME :
                empHrs = 4;
                System.out.println("Employee is present Part time.");
                break;

            default :
                empHrs = 0;
                System.out.println("Employee is absent.");

        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Daily Wage : $" + empWage);
    }

}
/*Solving using
Switch Case
Statement*/