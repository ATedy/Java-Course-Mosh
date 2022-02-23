package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
  public static void show() {
    var future = CompletableFuture.supplyAsync(() -> {
      System.out.println("Getting the current weather");
      throw new IllegalArgumentException();
    });

    // giving a default value in case the remote temp doesn't exist using exceptionally
    try {
     var temperature =  future.exceptionally(ex ->1).get();
      System.out.println(temperature);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }
}
