package org.example.Inheri;

public class myMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //create an object of the subclass
        Humanbeing HObj = new Humanbeing();

        //access field of superclass
        HObj.name = "Mr Best";
        HObj.display();

        // call method of superclass by using object of subclass
        HObj.eat();
    }
}
