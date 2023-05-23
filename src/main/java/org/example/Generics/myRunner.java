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
    }
}
