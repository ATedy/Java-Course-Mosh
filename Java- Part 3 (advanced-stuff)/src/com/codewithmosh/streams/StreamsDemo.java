package src.com.codewithmosh.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10, Genre.THRILLER),
        new Movie("b", 20, Genre.ACTION),
        new Movie("c", 30, Genre.ACTION)
    );

var result = movies.stream()
    .collect(Collectors.groupingBy(
        Movie::getGenre,
        Collectors.mapping(
            Movie::getTitle,
            Collectors.joining(", "))));

    System.out.println(result);

  }
}

