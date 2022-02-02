package com.inheritance;

import com.oop.sec1.TextBox;

public class Main {
    public static void main(String[] args) {
        var control = new TextBox();
        control.disabled();
        System.out.println(control.isEnabled());

    }
}
