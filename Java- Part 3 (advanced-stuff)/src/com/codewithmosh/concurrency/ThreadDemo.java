package src.com.codewithmosh.concurrency;

public class ThreadDemo {
  public static void show() throws InterruptedException {
    Thread thread = new Thread(new DownloadFileTask());
    thread.start();

    Thread.sleep(1000);
    System.out.println("file is ready to be scanned");

    thread.interrupt();

  }

}
