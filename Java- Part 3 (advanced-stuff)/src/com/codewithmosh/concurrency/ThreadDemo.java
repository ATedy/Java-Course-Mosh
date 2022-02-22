package src.com.codewithmosh.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
  public static void show() throws InterruptedException {

    List<Thread> threads = new ArrayList<>();
    List<DownloadFileTask> tasks = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      var task = new DownloadFileTask();
      tasks.add(task);

      Thread thread = new Thread(task);
      thread.start();
      threads.add(thread);
    }

    for (var thread: threads) {
      thread.join();
    }

    var totalBytes = tasks.stream()
        .map(t ->t.getStatus().getTotalBytes())
        .reduce(Integer::sum);

    // we will have 100_000 as expected as threads aren't modifying a shared object
    System.out.println(totalBytes);
  }

}
