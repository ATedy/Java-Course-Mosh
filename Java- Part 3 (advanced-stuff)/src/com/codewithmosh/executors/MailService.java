package src.com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
  public void send() {
    LongTask.simulate();
    System.out.println("Mail was sent.");

  }

  // executing in async way
  public CompletableFuture<Void>  sendAsync(){
    return CompletableFuture.runAsync(() ->send());
  }

}
