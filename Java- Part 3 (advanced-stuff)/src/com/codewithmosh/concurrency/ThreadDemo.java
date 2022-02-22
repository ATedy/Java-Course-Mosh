package src.com.codewithmosh.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
  public static void show() throws InterruptedException {
    var status = new DownloadStatus();

    List<Thread> threads = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      var thread = new Thread(new DownloadFileTask(status));
      thread.start();
      threads.add(thread);
    }

    for (var thread: threads) {
      thread.join();
    }

    System.out.println(status.getTotalBytes());

  }

}
