package src.com.codewithmosh;

public class Main {

    /**
     -  this programme is using 2 threads,
     -  one id main thread for running main method,
     -  2 for garbage collector: for removing unused objects from memory
     */
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}