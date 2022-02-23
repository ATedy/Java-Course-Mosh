package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
  public static int toFahrenheit (int celsius){
    return (int) (celsius * 1.8) + 32;

  }

  public static void show() {
    var future = CompletableFuture.supplyAsync(() -> 20);
    var result = future.
        thenApply(CompletableFuturesDemo::toFahrenheit)
        .thenAccept(f -> System.out.println(f));
  }
}
