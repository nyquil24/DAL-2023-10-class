package org.example.Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //Create Linked List
        LinkedList<String> linkObj = new LinkedList<String>();
        //Adding elements
        linkObj.add("A");
        linkObj.add("B");
        linkObj.add("C");
        linkObj.add("D");
        System.out.println(linkObj);

        //Add elements at specified position
        linkObj.add(4, "A");
        linkObj.add(5, "A");
        System.out.println(linkObj);

        //Adding an element to the first position
        linkObj.addFirst("AddedOnFirst");

        //Adding an element to the Last position
        linkObj.addLast("Last added");
        System.out.println(linkObj);

        System.out.println("Element on Index 4: " + linkObj.get(4));

        //set() method for overide or replace ay element
        linkObj.set(2, "B is replaced by BBBBB");
        System.out.println(linkObj);

        //Remove element
        linkObj.remove(0);    //removes AddedOnFirst
        System.out.println(linkObj);
        linkObj.remove("A");
        linkObj.remove("A"); //removes A
        System.out.println(linkObj);


    }
}
