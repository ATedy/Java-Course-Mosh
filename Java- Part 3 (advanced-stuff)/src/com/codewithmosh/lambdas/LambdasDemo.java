package src.com.codewithmosh.lambdas;

import java.util.function.Supplier;

/**
 * This supplier has specialization with primitive values and we have to call it using the get()
 */
public class LambdasDemo {
  public static void show() {
    Supplier<Double> getRandom = () -> Math.random();
    var random = getRandom.get();
    System.out.println(random);

  }


}
