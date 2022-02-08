package src.com.codewithmosh.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        // when err occurs only one of the catch blocks will execute
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        // chaining exception in one with |
        catch (IOException | ParseException e){
            System.out.println("Couldn't read data");
        }
    }
}