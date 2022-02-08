package src.com.codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        // when err occurs only one of the catch blocks will execute
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch (IOException e){
            System.out.println("Couldn't read data");
        }


    }
}