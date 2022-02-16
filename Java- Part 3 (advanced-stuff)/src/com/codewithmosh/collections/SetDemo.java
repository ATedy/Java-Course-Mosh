package src.com.codewithmosh.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

  /**
   * Set operations
   */
  public static void show() {

    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));

    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
    //union operation
    set1.addAll(set2);
    System.out.println(set1);

    //intersection operation
    set1.retainAll(set2);
    System.out.println(set1);

    //difference operation
    set1.removeAll(set2);
    System.out.println(set1);

  }

}


