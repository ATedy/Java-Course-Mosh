package com.codewithmosh.sec1;

public class Main {

    public static void main(String[] args) {
        // java compiler will detect what type var it is
        var employee = new Employee(50_000, 20);
        // as a static members we access them by class
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
