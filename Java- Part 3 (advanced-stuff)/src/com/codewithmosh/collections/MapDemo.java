package src.com.codewithmosh.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

  /**
   * this will be good for finding a value using its key special in big lists
   */
  public static void show(){
    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e2");
    var unknown = new Customer("Unknown", "");
    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);


    var customer = map.get("e1");
    var customer1 = map.getOrDefault("e10", unknown);
    System.out.println(customer);
    System.out.println(customer1);
  }

}
