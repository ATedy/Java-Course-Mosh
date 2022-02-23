package src.com.codewithmosh.executors;

public class CompletableFuturesDemo {

  public static void show() {
   var service = new FlightService();
   service.getQuote("site1")
       .thenAccept(System.out::println);

   // delay for the program to get a quote from the site
    try {
      Thread.sleep(10_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
