package src.com.codewithmosh.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
  public static void show() {
    var executor = Executors.newFixedThreadPool(2);

    try {
      var future =  executor.submit(() ->{
        LongTask.simulate();
        return 1;
      });

      try {
        // get here is a blocking method
        var result = future.get();
        System.out.println(result);
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    }

    finally {
      executor.shutdown();
    }

  }

}
