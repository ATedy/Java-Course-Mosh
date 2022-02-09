package src.com.codewithmosh;

import src.com.codewithmosh.generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        // no explicit cast needed
        int number = list.get(0);

    }
}
