package src.com.codewithmosh.concurrency;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
  public static void show() {
    // we have 2 threads available, but we got 10 tasks, internally they will put in a queue
    var executor = Executors.newFixedThreadPool(2);
    try {
      executor.submit(() ->{
        System.out.println(Thread.currentThread().getName());
      });
    }
    finally {
      executor.shutdown();
    }

  }

}
