package org.example.Poly;

public class myMain {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        //it's fine because a Pig is an animal by inheritance
        Animal myPig = new Pig(); // Create a Pig object

        //it's fine because a Dog is an animal by inheritance
        Animal myDog = new Dog(); // Create a Dog object

        myAnimal.animalSound() ;
        myPig.animalSound();
        myDog.animalSound();
    }
}
