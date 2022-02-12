package com.interfaces;

public class Dragger {
// we created an interfaces solely for one purpose if we want to include other interfaces at same time we can in
//inherit them
    public void drag(Draggable draggable){
        draggable.drag();
        System.out.println("Dragging Done");
    }
}

