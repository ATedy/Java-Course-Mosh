package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

  public static void show() {
    var first = CompletableFuture.supplyAsync(() ->1);
    var second = CompletableFuture.supplyAsync(() ->2);
    var third = CompletableFuture.supplyAsync(() ->3);

      // waiting all tasks to finish
    // variable all void bc we don't know what the 3 Comple will return
    var all = CompletableFuture.allOf(first, second, third);
    all.thenRun(() -> {
      try {
        var firstResult = first.get();
        System.out.println(firstResult);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      }
      System.out.println("All tasks completed successfully");
    });
  }
}
