package com.refactorMorageCalculator;

import java.util.Scanner;

public class Console {
    //method implementation detail, used internally that's why its static
    private static Scanner scanner = new Scanner(System.in);

    public static double readNUmber(String prompt) {
        return scanner.nextDouble();
    }
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
