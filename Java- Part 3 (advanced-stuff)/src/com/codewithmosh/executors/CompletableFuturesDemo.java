package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {

  public static void show() {
    var future = CompletableFuture.supplyAsync(() ->{
      LongTask.simulate();
      return 1;
    });

    try {
     var result =  future
          .completeOnTimeout(1, 1,  TimeUnit.SECONDS)
          .get();
      System.out.println(result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
