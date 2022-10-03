package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

  private List<TaxPayer> taxPayers = new ArrayList<>();
  private int currentIndex = 0;

  public void register(TaxPayer taxPayer) {
    taxPayers.add(taxPayer);
  }

  public double computeTotalMonthlyTaxToCollect() {
    double totalMonthlyTaxToCollect = 0.0;

    for (TaxPayer taxPayer : taxPayers) {
      double computeMonthlyTaxToPay = taxPayer.computeMonthlyTaxToPay();
      totalMonthlyTaxToCollect += computeMonthlyTaxToPay;
    }

    return totalMonthlyTaxToCollect;
  }

}