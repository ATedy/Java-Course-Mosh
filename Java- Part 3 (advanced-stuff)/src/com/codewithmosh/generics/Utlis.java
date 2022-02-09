package src.com.codewithmosh.generics;

/**
 * we are using a generic method in non generic class
 * since we can't simple use the > or < on the type T we extend the comparable with constraint <T>
 * */
public class Utlis {
    public static <T extends Comparable<T>> T max(T first, T second){
      return ( first.compareTo(second) < 0) ? second :first;
    }
}
