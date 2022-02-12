package com.inheritance;

public abstract class  UIControl {
    private boolean isEnabled = true;


//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl");
//    }

// final class where we can't inherit (extend) from them and methods where we can't override them

    // Abstract methods doesn't have implementation
    public abstract void render();

    public void enabled() {
         isEnabled = true;
    }

    public void disabled() {
         isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
