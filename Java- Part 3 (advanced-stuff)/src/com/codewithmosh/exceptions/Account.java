package src.com.codewithmosh.exceptions;

public class Account {
    public void deposit(float value){
        // throwing an exception (defensive programming)
        if (value <=0){
            throw new IllegalArgumentException();
        }
    }
}
