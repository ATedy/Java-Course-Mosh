package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 15),
        new Movie("c", 20)
    );

    // 1000 movies
    // 10 movies per page
    // 3rd page
    // skip(20) = skip((page -1 )  * pageSize )
    // limit(10) = limit(pageSize)

    movies.stream()
        .skip(20)
        .limit(10)
        .forEach(m -> System.out.println(m.getTitle()));

  }
}

