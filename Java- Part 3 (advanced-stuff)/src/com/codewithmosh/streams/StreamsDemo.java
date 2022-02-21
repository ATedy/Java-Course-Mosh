package src.com.codewithmosh.streams;

import java.util.List;
import java.util.Optional;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 20),
        new Movie("c", 30)
    );
    /**
     *   optional class represents an object that may or may not have a value
     *      how reducer works(it will accumulate the values
     *      [10, 20, 30]
     *      [30, 30]
     *      [60]
     *  so if we don't have some ) will be outputted
     */

   Optional<Integer> sum =  movies.stream()
        .map(movie -> movie.getLikes())
        .reduce(Integer::sum);

   // general purpose reduction with reduce method
    Integer sum1 =  movies.stream()
        .map(movie -> movie.getLikes())
        .reduce(0, Integer::sum);

    System.out.println(sum.orElse(0));
    System.out.println(sum1);

  }
}

