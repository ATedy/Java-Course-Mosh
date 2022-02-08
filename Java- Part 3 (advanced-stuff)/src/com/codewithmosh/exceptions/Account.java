package src.com.codewithmosh.exceptions;

import java.io.IOException;

public class Account {
    // letting caller of the classes may throw an IO exception and its part API
    public void deposit(float value) throws IOException{
        if (value <=0){
            throw new IOException();
        }
    }
}
