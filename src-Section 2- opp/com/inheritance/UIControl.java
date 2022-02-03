package com.inheritance;

public abstract class  UIControl {
    private boolean isEnabled = true;


//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl");
//    }


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
