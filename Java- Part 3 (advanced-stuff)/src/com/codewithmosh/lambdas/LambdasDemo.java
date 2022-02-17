package src.com.codewithmosh.lambdas;

public class LambdasDemo {
 public LambdasDemo(String message) {

 }
 // new in here is used for constructor
  public  void show() {
    greet(message -> new LambdasDemo(message));
    greet(LambdasDemo::new);

  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
