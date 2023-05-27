package org.example.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args) {
        //HashSet declaration
        HashSet<String> hset = new HashSet<String>();

        //Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        System.out.println(hset);
        //Addition of duplicat elements
        hset.add("Apple");
        hset.add("Mango");
        //additon of null values
        hset.add(null);
        hset.add(null);

        //displaying HashSet elements
        System.out.println(hset);
        Iterator<String> itObj = hset.iterator();
        System.out.println("HashSet using Iterator: ");
        //Accessing elements
        while(itObj.hasNext()){
            System.out.println(itObj.next());
            System.out.println(", ");
        }
    }
}
