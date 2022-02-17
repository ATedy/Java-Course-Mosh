package src.com.codewithmosh.lambdas;

/**
 * Lamda exp: If we have a functional interface we can represent our interface using lamda epx - No type declaration
 * need as compiler will get it from the signature of the method passed.
 */
public class LambdasDemo {

  public static void show() {

    greet(message -> System.out.println(message));

  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
