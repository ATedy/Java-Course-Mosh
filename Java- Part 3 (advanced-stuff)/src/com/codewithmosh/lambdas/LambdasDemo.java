package src.com.codewithmosh.lambdas;

/**
 * Lamda exp:
   - this represents the enclosing object but in anonymous class it refers to current instance of the anon.. class
 */
public class LambdasDemo {

  public String prefix = "-";

  public  void show() {
    greet(message -> System.out.println(prefix+ message));
    greet(message -> System.out.println(this + message));

  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
