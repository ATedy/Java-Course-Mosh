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

    // collector for joining values using delimiter
   var result = movies.stream()
       .filter(m -> m.getLikes() > 10)
       .map(Movie::getTitle)
       .collect(Collectors.joining(", "));

    System.out.println(result);

  }
}

