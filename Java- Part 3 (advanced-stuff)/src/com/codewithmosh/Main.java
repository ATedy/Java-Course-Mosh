package src.com.codewithmosh;

import src.com.codewithmosh.generics.GenericList;

public class Main {
    public static void main(String[] args) {
        // We can only pass Numbers here like int, float, short ...
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing- tho 1 is int(primitive it will be wrapped by the Integer)
        int number = numbers.get(0); // Unboxing - Javac will extract the number from the Integer object


    }
}
