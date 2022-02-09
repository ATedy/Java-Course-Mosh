package src.com.codewithmosh;

import src.com.codewithmosh.generics.GenericList;
import src.com.codewithmosh.generics.Instructor;
import src.com.codewithmosh.generics.User;
import src.com.codewithmosh.generics.Utlis;

public class Main {
    public static void main(String[] args) {
    var instructors = new GenericList<Instructor>();
    var users = new GenericList<User>();
        Utlis.printUser(users);

    }
}
