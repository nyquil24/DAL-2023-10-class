package org.example.Collections;

import org.example.Generics.Genericsclass;

public class myMain {
    public static void main(String[] args) {


    GenericBox<Integer> intBox = new GenericBox<Integer>();
    intBox.add(12);
    intBox.add(24);
    intBox.add(42);
    intBox.add(45);
        System.out.println(intBox.get());

        // creating Generic Instance for box

        GenericBox<Float> floatBox = new GenericBox<Float>();
        floatBox.add(12.3f);
        floatBox.add(18.5f);
        floatBox.add(120.45f);
        floatBox.add(85.4f);
        System.out.println(floatBox.get());

    }
}
