package src.com.codewithmosh.streams;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 15),
        new Movie("c", 20)
    );

    // Intermediate : map, filter
    // Terminal: forEach
     movies.stream()
        .filter(movie -> movie.getLikes() >10)
        .forEach(m -> System.out.println(m));

// or
    Predicate<Movie> isPopular = m -> m.getLikes() >10;
    movies.stream()
        .filter(isPopular)
        .forEach(m -> System.out.println(m));


  }
}

