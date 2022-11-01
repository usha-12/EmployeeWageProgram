package com.bridgelabz.employeewage;
public class CompanyWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursInMonth;
    public int totalEmpWage;

    public CompanyWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
        totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "\n" + companyName + " company Employee Monthly Wage : $" + totalEmpWage + "\n\n";
    }
}