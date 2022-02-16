package src.com.codewithmosh.generics;

public class Utils {
    public static <T> void max(T first, T second){
        return ;
    }

    public static void printUser (User user) {
        System.out.println(user);

    }
    /**
     * wildcards ? unknown types

     - class CAP#1 extends User {}- class
     - class Instructor extends User {} -class
     - with extend keyword we could only read not write
     with use super for writing
     - but using the super kw we can only  write or store it in super class which is Object
     */
//    public static void printUsers
//    (GenericList<? super User> users){
//        GenericList<Object> temp = new GenericList<>();
//        Object x = users.get(0);
//
//    }
}
