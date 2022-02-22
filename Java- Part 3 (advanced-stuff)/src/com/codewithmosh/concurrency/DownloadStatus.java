package src.com.codewithmosh.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
  private int totalBytes;
  private Lock lock = new ReentrantLock();

  public int getTotalBytes() {
    return totalBytes;
  }

  // using the lock object will lock the thread until it finished then unlock it after
  public void incrementTotalBytes(){
    synchronized (this){
      totalBytes++;
    }

  }





}
