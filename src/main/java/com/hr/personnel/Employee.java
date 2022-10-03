package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double computeMonthlyCompensation();

    public int computeNumberOfYearsWorkedSinceHired() {
        int hireDateYear = hireDate.getYear();
        int todayYear = LocalDate.now().getYear();
        int yearsWorked = todayYear - hireDateYear;
        return yearsWorked;
    }

    public String work() {
        return name + " worked";
    }

    public abstract String getEmployeeInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

}
