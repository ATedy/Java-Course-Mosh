package src.com.codewithmosh;

import src.com.codewithmosh.generics.GenericList;
import src.com.codewithmosh.generics.Instructor;
import src.com.codewithmosh.generics.User;
import src.com.codewithmosh.generics.Utils;

public class Main {
    public static void main(String[] args) {
        // here we can pass a list of anything to the users bc we using the wildcards
    var instructors = new GenericList<Instructor>();
    var users = new GenericList<User>();
        Utils.printUsers(new GenericList<User>());

    }
}
