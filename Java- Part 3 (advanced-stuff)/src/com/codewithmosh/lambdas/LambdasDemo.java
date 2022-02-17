package src.com.codewithmosh.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
  public static void show() {
    List<String> list = List.of("a", "b", "c");
    Consumer<String> print = item -> System.out.println(item);
    Consumer<String> printInUpperCase = item -> System.out.println(item.toUpperCase());

   list.forEach(print.andThen(printInUpperCase));
  }


}
