package src.com.codewithmosh.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
        new Movie("a", 10),
        new Movie("b", 15),
        new Movie("c", 20)
    );
// imperative programming
    int count = 0;
    for(var movie: movies){
      if (movie.getLikes() > 10)
        count++;
    }
   // Declarative (functional) Programming
    var count2 = movies.stream()
        .filter(movie -> movie.getLikes() > 10)
        .count();
  }
}

/**
 * Imperative Programming (expressing what needs to be done)
 * Declarative: how needs to be done
 *  Stream: is a sequence of objects, doesn't store data like a collection but its a way to get data out a collection
 */
