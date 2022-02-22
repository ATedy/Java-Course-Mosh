package src.com.codewithmosh.concurrency;

public class ThreadDemo {
  public static void show() throws InterruptedException {
    System.out.println(Thread.currentThread().getName());

        for (int  i = 0; i < 5; i++) {
          Thread thread = new Thread(new DownloadFileTask());
          thread.start();
          // join block the 2nd thread from starting until thr 1st one finishes
          thread.join(5000);

          System.out.println("file is ready to be scanned");
    }

  }

}
