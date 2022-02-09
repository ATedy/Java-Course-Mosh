package src.com.codewithmosh.generics;

/**
 * we are using a generic method in non generic class
 * */
public class Utlis {
    public static <T extends Comparable<T>> T max(T first, T second){
      return ( first.compareTo(second) < 0) ? second :first;
    }

    /**
     * multiple parameters with type T instead of fixed types
     * K for key and V for V as convention
     * */
    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }
}
