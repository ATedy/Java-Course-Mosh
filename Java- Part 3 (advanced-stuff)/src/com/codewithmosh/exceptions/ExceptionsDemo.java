package src.com.codewithmosh.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        // IN java before accessing an obj we have to inti it
        FileReader reader = null;
        try {
             reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (IOException e){
            System.out.println("Couldn't read data");
        }
        //finaly will always executed
        finally {
            // the close method is throwing an IO exception
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}