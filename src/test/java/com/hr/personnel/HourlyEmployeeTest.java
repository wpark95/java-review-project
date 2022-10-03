package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class HourlyEmployeeTest {

  private HourlyEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new HourlyEmployee("joe",
        LocalDate.of(2020, 03, 23),
        10.0,
        320);
  }

  @Test
  public void computeMonthlyCompensation_should_return_valid_result() {
    assertEquals(employee.computeMonthlyCompensation(), 3200.0, 0.00001);
  }

  @Test
  public void computeMonthlyTaxToPay_should_return_correct_tax_amount() {
    assertEquals(employee.computeMonthlyTaxToPay(), 800, 0.00001);
  }

  @Test
  public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {
    assertEquals("name = joe, hireDate = 2020-03-23, hourlyRate = 10.0, hoursWorkedPerMonth = 320",
        employee.getEmployeeInfo());
  }

}