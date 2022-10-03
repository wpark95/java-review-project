package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void SetUp() throws Exception {
    employee = new Employee("sang", LocalDate.of(2020, 01, 20));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {
    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    assertEquals("name = sang, hireDate = 2020-01-20", employeeInfo);
  }

  @Test
  public void work_should_return_name_worked_string() {
    String work = employee.work();
    assertEquals(work, "sang worked");
  }

}