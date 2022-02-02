package com.inheritance;

public class UIControl {

    private boolean isEnabled = true;

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
