package src.com.codewithmosh;

import src.com.codewithmosh.executors.MailService;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        var service = new MailService();
        service.sendAsync();
        System.out.println("hello");

// showing the mail thread was execute
        Thread.sleep(5000);

    }
}