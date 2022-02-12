package com.interfaces;

public interface UIWidget extends Draggable, Resizable {
    // here the interface have 2 parents so in time there is same implementation in both I it will on take from one
    void render();
}


