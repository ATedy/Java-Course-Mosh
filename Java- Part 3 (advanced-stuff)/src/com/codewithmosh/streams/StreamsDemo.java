package src.com.codewithmosh.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 20),
        new Movie("c", 30)
    );

    // summarizing collectors
   var result = movies.stream()
       .filter(m -> m.getLikes() > 10)
       .collect(Collectors.summarizingInt(Movie::getLikes));

    System.out.println(result);

  }
}

