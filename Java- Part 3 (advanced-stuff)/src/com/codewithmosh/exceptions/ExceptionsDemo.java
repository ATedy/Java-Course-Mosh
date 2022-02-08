package src.com.codewithmosh.exceptions;

import java.util.logging.FileHandler;

public class ExceptionsDemo {
    public static void show() {
        sayHello(null);
    }
    var reader = new FileHandler("file.txt");

    public static void sayHello(String name) {
        System.out.println(name.toLowerCase());
    }
}
