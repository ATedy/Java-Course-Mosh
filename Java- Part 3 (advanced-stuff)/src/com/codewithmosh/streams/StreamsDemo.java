package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 20),
        new Movie("c", 30)
    );
// Peek: used for showing after each stream done, and good for processing pipeline unlike forEach
    movies.stream()
        .filter(m -> m.getLikes() > 10)
        .peek(movie -> System.out.println("filtered " + movie.getTitle()))
        .map(Movie::getTitle)
        .peek(t ->System.out.println("Mapped: " + t))
        .forEach(System.out::println);
  }
}

