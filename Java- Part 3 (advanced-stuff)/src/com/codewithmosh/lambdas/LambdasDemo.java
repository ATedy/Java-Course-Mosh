package src.com.codewithmosh.lambdas;

/**
 * Method references
 */
public class LambdasDemo {
  public  void print(String message) {}

  public  void show() {
    var demo = new LambdasDemo();
    greet(message -> demo.print(message));
    greet(demo::print);

  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
