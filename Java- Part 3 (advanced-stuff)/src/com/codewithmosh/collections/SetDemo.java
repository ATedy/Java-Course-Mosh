package src.com.codewithmosh.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

  /**
   * Set intreface doesn't put duplicates n put them in random order
   */
  public static void show() {
    Set<String> set = new HashSet<>();
    set.add("sky");
    set.add("is");
    set.add("blue");
    set.add("blue");
    System.out.println(set);
  }

}
