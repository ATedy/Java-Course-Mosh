package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

  public static void show() {
   var first =  CompletableFuture.supplyAsync(() ->{
     LongTask.simulate();
     return 20;
   });
    var second =  CompletableFuture.supplyAsync(()-> 20 );

     CompletableFuture
         .anyOf(first, second)
             .thenAccept(temp -> System.out.println(temp));

  }
}
