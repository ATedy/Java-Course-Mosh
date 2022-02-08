package src.com.codewithmosh;

import src.com.codewithmosh.exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        }
        // Throwable is a generic exception handler Throwable as it is parent of all exc
        catch (Throwable e) {
            System.out.println("An unexpected error occurred");
        }
    }
}
