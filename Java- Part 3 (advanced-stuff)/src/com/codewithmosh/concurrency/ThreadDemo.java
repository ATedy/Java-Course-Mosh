package src.com.codewithmosh.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ThreadDemo {
  // to use thread safe hashmap with multiple threads we use ConcurrentHashMap instead of the normal one
  public static void show() throws InterruptedException {
    Map<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "a");
    map.get(1);
    map.remove(1);
    }

}
