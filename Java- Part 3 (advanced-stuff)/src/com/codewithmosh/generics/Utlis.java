package src.com.codewithmosh.generics;

/**
 * we are using a generic method in non generic class
 * */
public class Utlis {
    public static <T extends Comparable<T>> T max(T first, T second){
      return ( first.compareTo(second) < 0) ? second :first;
    }

    public static void printUser (User user) {
        System.out.println(user);

    }

    public static void printUsers(GenericList<User> users){

    }
}
