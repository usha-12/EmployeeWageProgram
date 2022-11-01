package com.bridgelabz.employeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWage implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private LinkedList<CompanyWage> companyWageList;
    private Map<String, CompanyWage> companyToWageMap;

    public EmployeeWage() {
        companyWageList = new LinkedList<>();
        companyToWageMap = new HashMap<>();
    }

    public static void main(String args[]) {
        IComputeEmpWage wageCalculator = new EmployeeWage();

        wageCalculator.addCompany("Google", 50, 15, 200);
        wageCalculator.addCompany("Amazon", 80, 20, 120);
        wageCalculator.addCompany("Netflix", 90, 18, 220);
        wageCalculator.computeEmpWage();
        System.out.println("Total Wage for Google : $" + wageCalculator.getTotalEmpWage("Google"));
        System.out.println("Total Wage for Amazon : $" + wageCalculator.getTotalEmpWage("Amazon"));
        System.out.println("Total Wage for Netflix : $" + wageCalculator.getTotalEmpWage("Netflix"));
    }

    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        CompanyWage companyWage = new CompanyWage(companyName, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
        companyWageList.add(companyWage);
        companyToWageMap.put(companyName, companyWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyWageList.size(); i++) {
            CompanyWage companyWage = companyWageList.get(i);
            companyWage.setTotalEmpWage(this.computeEmpWage(companyWage));
            System.out.println(companyWage);
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

    @Override
    public int getTotalEmpWage(String company) {
        return companyToWageMap.get(company).totalEmpWage;
    }
}
/*Ability to get the
Total Wage when
queried by Company - Create Method in
EmpWageBuilder to get total
wage by Company*/