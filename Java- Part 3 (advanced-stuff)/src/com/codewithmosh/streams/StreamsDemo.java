package src.com.codewithmosh.streams;

import java.util.stream.IntStream;

public class StreamsDemo {
  //IntStream for primitive types
  public static void show() {
    IntStream.range(1, 5)
        .forEach(System.out::println);

    // upper bound included
    IntStream.rangeClosed(1, 5)
        .forEach(System.out::println);
  }
}

