package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double hourlyRate;
  private int hoursWorkedPerMonth;

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double hourlyRate, int hoursWorkedPerMonth) {
    super(name, hireDate);
    setHourlyRate(hourlyRate);
    setHoursWorkedPerMonth(hoursWorkedPerMonth);
  }

  @Override
  public double computeMonthlyCompensation() {
    return getHourlyRate() * getHoursWorkedPerMonth();
  }

  @Override
  public double computeMonthlyTaxToPay() {
    return computeMonthlyCompensation() * HOURLY_TAX_RATE;
  }

  @Override
  public String getEmployeeInfo() {
    return "name = " + getName() + ", "
        + "hireDate = " + getHireDate() + ", "
        + "hourlyRate = " + getHourlyRate() + ", "
        + "hoursWorkedPerMonth = " + getHoursWorkedPerMonth();
  }

  public int getHoursWorkedPerMonth() {
    return hoursWorkedPerMonth;
  }

  public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

}