package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 15),
        new Movie("c", 20)
    );
    movies.stream()
        .map(movie -> movie.getTitle())
        .forEach(name -> System.out.println(name));

  }
}

