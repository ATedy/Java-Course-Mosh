package com.oop.sec1;

import com.inheritance.UIControl;

public class TextBox extends UIControl {
  private String text = "";

  public TextBox() {
    super(true);
    System.out.println("TextBox");
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
