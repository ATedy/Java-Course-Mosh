package com.inheritance;

import com.oop.sec1.TextBox;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        // here the control object will render each method in the respective classes using the polymorphism
        for (var control: controls) {
            control.render();

        }

    }
}
