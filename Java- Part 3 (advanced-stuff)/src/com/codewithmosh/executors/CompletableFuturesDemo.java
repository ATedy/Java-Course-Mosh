package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
  public static void show() {
   var future =  CompletableFuture.supplyAsync(() -> 1);
   future.thenRun(() ->{
     System.out.println(Thread.currentThread().getName());
     System.out.println("Done");
   });

  }

}
