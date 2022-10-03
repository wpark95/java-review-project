package com.hr.corp;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CorporationTest {

  private Corporation corp;

  @Before
  public void setUp() {
    corp = new Corporation("Tax Evasion Corp", 2_000_000.0);
  }

  @Test
  public void computeMonthlyTaxToPay() {
    Assertions.assertThat(corp.computeMonthlyTaxToPay()).isEqualTo(200_000.0);
  }

}