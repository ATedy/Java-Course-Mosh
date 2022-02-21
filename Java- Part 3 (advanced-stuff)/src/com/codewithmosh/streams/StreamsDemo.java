package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("b", 10),
        new Movie("a", 10),
        new Movie("c", 20),
        new Movie("d", 30)
    );
 // distinct stream is used for getting values with no duplication
  movies.stream()
      .map(Movie::getLikes)
      .distinct()
      .forEach(System.out::println);
  }
}

