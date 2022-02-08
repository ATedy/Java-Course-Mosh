package src.com.codewithmosh;

import src.com.codewithmosh.generics.List;
import src.com.codewithmosh.generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        /**
         * by declaring items as objects we can store any data type
         * For the primitive data types wrapper class for all primitive data types
         then like Integer.valueOf(1) - a reference type

         - The problem with declaring any type as object is we hv to explicitly tell the
         what data type it is when we storing in a variable like
         int number = (int) list.get(0) // wc more code
         */
        list.add(1);
        list.add("1");
        list.add(new User());
        int number = (int) list.get(0);
    }
}
