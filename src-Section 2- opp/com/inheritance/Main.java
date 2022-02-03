package com.inheritance;

import com.oop.sec1.Point;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
         System.out.println(point1.equals(point1));
         //hashcode is same based on the contents of the object not the default address as we override it
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}
