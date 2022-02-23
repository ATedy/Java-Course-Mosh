package src.com.codewithmosh.executors;

import java.util.stream.Collectors;

public class CompletableFuturesDemo {

  public static void show() {
   var service = new FlightService();
   service.getQuotes()
       .map(future -> future.thenAccept(System.out::println))
       .collect(Collectors.toList());


    try {
      Thread.sleep(10_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
