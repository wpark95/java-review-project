package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("sang",
        LocalDate.of(2020, 05, 23),
        1000.0);
  }

  @Test
  public void computeMonthlyCompensation_returns_monthly_salary() {

    assertEquals(employee.computeMonthlyCompensation(), 1000.0, 0.01);
  }

  @Test
  public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

    assertEquals("name = sang, hireDate = 2020-05-23, monthlySalary = 1000.0", employee.getEmployeeInfo());
  }

}