package com.interfaces;

public class TaxReport {
    // dependency injection with setters
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
      this.calculator = calculator;
    }

      public void show() {
            var tax = calculator.calculateTax();
          System.out.println(tax);
      }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
