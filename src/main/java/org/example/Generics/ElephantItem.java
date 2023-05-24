package org.example.Generics;

public class ElephantItem<U> implements Moveable<U> {
    private String location;
    private U item;

    @Override
    public void move(U t, String locationCode)
    {
        item = t;
        location = locationCode;
    }
    @Override
    public U getItemBeingMoved(){
        return item;
    }

    @Override
    public String getLocaitonBeingMovedTo() {
        return null;
    }

    @Override
    public String getLocationBeingMovedTo(){
        return location;
    }
}
