package org.example.Generics;

public class MathBox<E extends Number> {
    private final E data;
    public MathBox(E data){
        this.data = data;
    }
    public double sqrt(){
            return Math.sqrt(this.data.doubleValue());
    }
}

