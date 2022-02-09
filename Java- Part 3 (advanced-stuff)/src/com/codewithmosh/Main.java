package src.com.codewithmosh;

import src.com.codewithmosh.generics.User;
import src.com.codewithmosh.generics.Utlis;

public class Main {
    public static void main(String[] args) {
      var max =  Utlis.max(1, 3);
      var maxUsers =  Utlis.max(new User(10), new User(20));
        System.out.println(max);
        System.out.println(maxUsers);

    }
}
