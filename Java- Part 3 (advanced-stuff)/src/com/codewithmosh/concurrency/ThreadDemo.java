package src.com.codewithmosh.concurrency;

public class ThreadDemo {
  public static void show() {
    var status = new DownloadStatus();

    var thread1 = new Thread(new DownloadFileTask());
    var thread2 = new Thread(() ->{
      while (!status.isDone()) {
        synchronized (status){
          try {
            // while will sleep till its awakening by another thread
            status.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        }

      }
      System.out.println(status.getTotalBytes());
    });

    thread1.start();
    thread2.start();


  }

}
