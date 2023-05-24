package org.example.Generics;

import java.lang.reflect.GenericArrayType;

public class myRunner {
    public static void main(String[] args) {
        System.out.println("===invoking regular method=========");
        genericMethodExample obj = new genericMethodExample();
        obj.printValues(43);
        obj.printValues("Programmer");
        obj.printValues(54.43);
        obj.printValues(true);

        System.out.println("===invoking static method=========");
        genericMethodExample.staticdisplayData(254);
        genericMethodExample.staticdisplayData("Java Developer");
        genericMethodExample.staticdisplayData(254.25);

        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A','V','A'};
        System.out.println("Printing Integer Array");
        genericMethodExample.printArray( intArray);
        System.out.println("Printing Character Array");
        genericMethodExample.printArray(charArray);

        // initialize generic class
        // with Integer data
        Genericsclass<Integer> intObj = new Genericsclass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class again
        // with String data
        Genericsclass<String> stringObj = new Genericsclass<>("Java");
        System.out.println("Generic Class returns: " + stringObj.getData());

        ElephantItem<Integer> ObjMove = new ElephantItem<>();
        ObjMove.move(5, "NYC");
        System.out.println(ObjMove.getItemBeingMoved() + " Item");
        System.out.println(ObjMove.getLocationBeingMovedTo() + " Location");
    }
}
