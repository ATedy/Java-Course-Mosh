package src.com.codewithmosh;

import src.com.codewithmosh.generics.GenericList;
public class Main {
    public static void main(String[] args) {
    var list = new GenericList<String>();
    var iterator = list.iterator();
    while (iterator.hasNext()){
        var current = iterator.next();
        System.out.println(current);
    }

    }
}
