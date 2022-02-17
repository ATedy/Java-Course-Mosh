package src.com.codewithmosh.lambdas;

import java.util.List;

public class LambdasDemo {
  public  void show() {
    List<Integer> list = List.of(1, 2, 3);

    // Imperative programming
    for (var item: list){
      System.out.println(item);
    }

    // Declarative programming
    list.forEach(item -> System.out.println(item));

  }


}
