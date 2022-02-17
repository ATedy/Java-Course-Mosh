package src.com.codewithmosh.lambdas;

import java.util.function.Predicate;


/** Predicate
  - logical and, or, negate
 */
public class LambdasDemo {
  public static void show() {
    Predicate<String> hasLeftBrace = str -> str.startsWith("{");
    Predicate<String> hasRightBrace = str -> str.endsWith("}");

    Predicate<String> hasLeftAndRightBraces= hasLeftBrace.and(hasRightBrace);
    hasLeftAndRightBraces.test("{key:value}");

  }

}
