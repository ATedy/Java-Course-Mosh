package src.com.codewithmosh.lambdas;

/**
 * new Printer Interface is anonymous inner class because
 - no name and its inside a class
 */
public class LambdasDemo {
  public static void show() {

    greet(new Printer() {
      @Override
      public void print(String message) {
        System.out.println(message);

      }
    });

  }
  public  static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
