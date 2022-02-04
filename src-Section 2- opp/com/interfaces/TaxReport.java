package com.interfaces;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(100000);
    }

  public void show() {
        var tax = calculator.calculateTax();
      System.out.println(tax);
  }
}
