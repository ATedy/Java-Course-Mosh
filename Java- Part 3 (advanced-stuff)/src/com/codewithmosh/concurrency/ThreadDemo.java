package src.com.codewithmosh.concurrency;

public class ThreadDemo {
  public static void show() throws InterruptedException {
    Thread thread = new Thread(new DownloadFileTask());
    thread.start();

    Thread.sleep(1000);
    System.out.println("file is ready to be scanned");

    // this interrupt doesn't actually interrupt the thread, it sends an interrupt message instead and we check the
    // request and handle it
    thread.interrupt();

  }

}
