package src.com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collectionsDemo {
  public static void show(){
    Collection<String> collection = new ArrayList<>();
    Collections.addAll(collection, "a", "b", "c");

    for (var item: collection) {
      System.out.println(item);

    }

  }

}
