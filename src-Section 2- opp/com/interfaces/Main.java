package com.interfaces;

public class Main {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();
// using the setter we pasiing a new year tax/ class and with the report object will have dfft report displayed
        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}
