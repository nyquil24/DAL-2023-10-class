package org.example.Collections;
import java.util.ArrayList;
public class ArraylistExample
{
    public static void main(String[] args) {
        ArrayList<String> Mylist = new ArrayList<String>();
        Mylist.add("New Jersey");
        Mylist.add("Dallas");
        Mylist.add("New York");
        Mylist.add("Chicago");
        Mylist.add("LA");
        System.out.println("Return boolean :" + Mylist.contains("Chicago"));
        System.out.println("Return index value of Element : " +
                Mylist.indexOf("Chicago"));
        System.out.println("Returns the actual Element at the given index : " +
                Mylist.get(2));
        System.out.println("Returns the length of the arraylist :" + Mylist.size());
        //Remove the element at the given index. Returns the removed element. j
        //remove element at index 3
        String removedElement = Mylist.remove(3);
        System.out.println("Removed Element: " + removedElement);
        //remove all elements
        Mylist.clear();
        System.out.println("ArrayList after clear(): " + Mylist);

        ArrayList<String> al = new ArrayList();
        al.add("Jack");
        al.add("Tyler");
        al.add("James");

        //Enhanced for each loop
        for (String st: al){
            System.out.println(st);
        }

    }
}
