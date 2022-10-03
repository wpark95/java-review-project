package gov.irs;

import static org.junit.Assert.*;

import com.hr.corp.Corporation;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class IRSTest {

  private IRS irs;

  @Before
  public void setUp() {
    HourlyEmployee hourlyEmployee = new HourlyEmployee("joe",
        LocalDate.of(2020, 06, 06),
        50.0,
        320);
    SalariedEmployee salariedEmployee = new SalariedEmployee("jane",
        LocalDate.of(2020, 06, 06),
        8000.0);
    Corporation corp = new Corporation("bad corp", 1_000_000.0);
    irs = new IRS();

    irs.register(hourlyEmployee);
    irs.register(salariedEmployee);
    irs.register(corp);
  }

  @Test
  public void computeTotalMonthlyTaxToCollect_should_return_valid_tax_amount() {
    assertEquals(irs.computeTotalMonthlyTaxToCollect(), 106_400, 0.00001);
  }

}