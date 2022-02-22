package src.com.codewithmosh.concurrency;

public class DownloadStatus {
  // volatile keyword makes changes visible across threads
  private volatile boolean isDone;
  private int totalBytes;
  private int totalFiles;
  private Object totalBytesLock = new Object();



  public int getTotalFiles() {
    return totalFiles;
  }

  public int getTotalBytes() {
    return totalBytes;
  }

  // using the lock object will lock the thread until it finished then unlock it after
  public void incrementTotalBytes() {
    synchronized (totalBytesLock) {
      totalBytes++;
    }
  }

    public void incrementTotalFiles() {
        totalFiles++;
    }


  public boolean isDone() {
    return isDone;
  }

  public synchronized void done() {
    isDone = true;
  }

}
