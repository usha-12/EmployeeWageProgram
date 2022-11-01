package com.bridgelabz.employeewage;

public interface IComputeEmpWage {
     void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
     void computeEmpWage();
}
//