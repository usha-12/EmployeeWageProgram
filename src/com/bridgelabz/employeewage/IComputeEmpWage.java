package com.bridgelabz.employeewage;

public interface IComputeEmpWage {
    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
    public void computeEmpWage();
}
