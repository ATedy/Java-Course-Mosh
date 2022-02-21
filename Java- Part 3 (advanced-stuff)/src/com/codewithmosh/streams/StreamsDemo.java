package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 15),
        new Movie("c", 20)
    );
// takeWhile: it stops when it finds first element that matches the conditions
// dropWhile: opposite of takeWhile, will filter out all elements that doesn't match the criteria
    movies.stream()
        .takeWhile(m -> m.getLikes() < 30)
        .forEach(m -> System.out.println(m.getTitle()));

  }
}

