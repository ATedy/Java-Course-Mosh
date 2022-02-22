package src.com.codewithmosh.concurrency;

public class DownloadStatus {
  private int totalBytes;
  private int totalFiles;

  public int getTotalFiles() {
    return totalFiles;
  }

  public int getTotalBytes() {
    return totalBytes;
  }

  // using the lock object will lock the thread until it finished then unlock it after
  public synchronized  void incrementTotalBytes(){
      totalBytes++;
    }

    public void incrementTotalFiles() {
      synchronized (this){
        totalFiles++;
      }
    }


  }





}
