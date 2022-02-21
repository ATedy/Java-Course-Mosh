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

     // Using Collectors to convert to list, set, and hashMap
   var result = movies.stream()
       .filter(m -> m.getLikes() > 10)
       .collect(Collectors.toList());

    var result1 = movies.stream()
        .filter(m -> m.getLikes() > 10)
        .collect(Collectors.toSet());

    // key (title)
    // value (likes)
    var result2 = movies.stream()
        .filter(m -> m.getLikes() > 10)
        .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));

    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);

  }
}

