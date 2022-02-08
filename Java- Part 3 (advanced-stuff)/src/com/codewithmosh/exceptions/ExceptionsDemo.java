package src.com.codewithmosh.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        /**
         - try with resources, will it arguments and finally block won't be needed as it will be handled
         implicitly by the J compiler and will implement the AutoClosable
         - and we can create many objects by separating them using ;
         */
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("file.txt");
        ){
            var value = reader.read();
        }
        catch (IOException e){
            System.out.println("Couldn't read data");
        }
    }
}