package src.com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable{

  private DownloadStatus status;

  public DownloadFileTask(DownloadStatus status) {
    this.status = status;
  }

  @Override
  public void run() {

    for (int  i = 0; i < 100_000; i++) {
      if (Thread.currentThread().isInterrupted())return;
      status.incrementTotalBytes();
    }

    status.done();
    System.out.println("Download complete: " + Thread.currentThread().getName());
  }

  public DownloadStatus getStatus() {
    return status;
  }
}
