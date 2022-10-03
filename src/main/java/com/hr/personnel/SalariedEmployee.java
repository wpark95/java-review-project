package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double monthlySalary;

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
    super(name, hireDate);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double computeMonthlyCompensation() {
    return getMonthlySalary();
  }

  @Override
  public double computeMonthlyTaxToPay() {
    return computeMonthlyCompensation() * SALARIED_TAX_RATE;
  }

  @Override
  public String getEmployeeInfo() {
    return "name = " + getName() + ", "
        + "hireDate = " + getHireDate() + ", "
        + "monthlySalary = " + getMonthlySalary();
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

}
