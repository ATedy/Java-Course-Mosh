package src.com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
public static void show(){
  /**
   * List uses
   - index, last index, subList
   */

    List<String> list = new ArrayList<>();
    Collections.addAll(list, "a", "b", "c");
    System.out.println(list);

  }
}



