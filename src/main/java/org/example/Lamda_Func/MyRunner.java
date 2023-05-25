package org.example.Lamda_Func;

public class MyRunner {
    public static void main(String[] args) {
        MainEntry start = new MainEntry();

        int[] numbers = {2,2,4,4};

        start.add.compute(numbers);
        start.sub.compute(numbers);
        start.mult.compute(numbers);
        start.divide.compute(numbers);

    }
}
