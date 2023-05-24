package org.example.Generics;

public class Genericsclass<T> {
    private T data; // class variable of T type
    public Genericsclass(T data) {
        this.data = data;
    }
    // method that return T type variable
    public T getData() {
        return this.data;
    }


}

