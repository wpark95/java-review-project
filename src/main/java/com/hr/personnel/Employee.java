package com.hr.personnel;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate = " + hireDate;
    }

    public String work() {
        return name + " worked";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

}
