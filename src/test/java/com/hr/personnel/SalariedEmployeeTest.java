package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("john",
        LocalDate.of(2020, 05, 23),
        6000.0);
  }

  @Test
  public void computeMonthlyCompensation_returns_monthly_salary() {
    assertEquals(employee.computeMonthlyCompensation(), 6000.0, 0.00001);
  }

  @Test
  public void computeMonthlyTaxToPay_should_return_correct_tax_amount() {
    assertEquals(employee.computeMonthlyTaxToPay(), 1800, 0.00001);
  }

  @Test
  public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

    assertEquals("name = john, hireDate = 2020-05-23, monthlySalary = 6000.0", employee.getEmployeeInfo());
  }

}