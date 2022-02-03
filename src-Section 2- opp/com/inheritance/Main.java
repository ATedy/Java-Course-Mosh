package com.inheritance;

import com.oop.sec1.TextBox;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);
    }
    private static void show(UIControl control) {
        if(control instanceof TextBox){
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
