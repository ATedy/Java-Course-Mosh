package src.com.codewithmosh.lambdas;

import java.util.function.Function;

public class LambdasDemo {
  public static void show() {
    // "key:value"
    // first: "key=value"
    // second: "{key=value}"
    Function<String, String> replaceColon = str -> str.replace(":", "=");
    Function<String, String> addBraces = str -> "{" + str + "}";

    // Declarative programming
    var result = replaceColon
        .andThen(addBraces)
        .apply("key:value");

    // same result in reverse order
    var result1 =  addBraces.compose(replaceColon).apply("key:value");
    System.out.println(result);
    System.out.println(result1);


  }

}
