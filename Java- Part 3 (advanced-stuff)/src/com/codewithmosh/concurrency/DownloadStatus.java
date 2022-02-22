package src.com.codewithmosh.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
  private volatile boolean isDone;
  private LongAdder totalBytes = new LongAdder();
  private int totalFiles;


  public int getTotalFiles() {
    return totalFiles;
  }

  public int getTotalBytes() {
    // will call the sum value internally
    return totalBytes.intValue();
  }

  public void incrementTotalBytes() {
      totalBytes.increment();

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
