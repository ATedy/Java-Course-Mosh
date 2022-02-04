package com.interfaces;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

 // each class have a method which implements the interface and using the overrode ann we telling java compiler
    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}

