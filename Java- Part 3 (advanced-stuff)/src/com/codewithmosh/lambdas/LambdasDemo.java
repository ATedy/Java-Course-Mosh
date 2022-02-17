package src.com.codewithmosh.lambdas;

/**
 * Method references
 */
public class LambdasDemo {
  public static void print(String message) {}

  public  void show() {
    greet(message -> print(message));
    greet(LambdasDemo::print);

  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
