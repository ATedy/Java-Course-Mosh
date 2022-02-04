package com.interfaces;

public class Main {
    public static void main(String[] args) {
        // now we creating instance of the class and inject/pass the calculator
        // here we can create new Tax classes and modify them, our tax report won't be affect as it doesn't know about it
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);

    }
}
