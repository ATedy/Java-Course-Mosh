package src.com.codewithmosh.streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("b", 15),
        new Movie("a", 10),
        new Movie("c", 20)
    );

    movies.stream()
        .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
        .sorted(Comparator.comparing(Movie::getTitle).reversed())
        .forEach(m -> System.out.println(m.getTitle()));


    movies.stream()
        .sorted(Comparator.comparing(movie -> movie.getTitle()))
        .forEach(m -> System.out.println(m.getTitle()));

  }
}

