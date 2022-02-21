package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 20),
        new Movie("c", 30)
    );
    // anyMatch, allMatch, noneMatch
    movies.stream()
        .noneMatch(m ->m.getLikes() > 20);

  }
}

