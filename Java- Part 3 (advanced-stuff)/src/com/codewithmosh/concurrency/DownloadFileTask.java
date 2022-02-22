package src.com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable{

  private DownloadStatus status;

  public DownloadFileTask() {
    this.status = new DownloadStatus();
  }

  @Override
  public void run() {

    for (int  i = 0; i < 1_000_000; i++) {
      if (Thread.currentThread().isInterrupted())return;
      status.incrementTotalBytes();
    }

    status.done();
    // telling the other thread state 1st thread is changed
    synchronized (status){
      status.notifyAll();
    }

    System.out.println("Download complete: " + Thread.currentThread().getName());
  }

  public DownloadStatus getStatus() {
    return status;
  }
}
