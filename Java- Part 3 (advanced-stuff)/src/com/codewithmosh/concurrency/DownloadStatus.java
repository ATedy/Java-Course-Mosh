package src.com.codewithmosh.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
  private volatile boolean isDone;
  private AtomicInteger totalBytes = new AtomicInteger();
  private int totalFiles;


  public int getTotalFiles() {
    return totalFiles;
  }

  // Atomic type works by compare and swap
  public int getTotalBytes() {
    return totalBytes.get();
  }

  // multiple threads can modify this threads without racing e other
  public void incrementTotalBytes() {
      totalBytes.incrementAndGet();

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
