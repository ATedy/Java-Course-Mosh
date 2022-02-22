package src.com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable{

  @Override
  public void run() {
    System.out.println("downloading a file: " + Thread.currentThread().getName());

  }
}
