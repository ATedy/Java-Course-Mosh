package src.com.codewithmosh.exceptions;
// Creating Custom Exception
// checked -> Exception
// Unchecked (runtime)  -> Runtime

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        //passing to the constructor of Exception class
        super("InsufficientFundsException");
    }
    public InsufficientFundsException(String message){
        super(message);
    }

}
