package org.example.Arrays;

import java.util.Arrays;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class ReversingArrays {
    static void reverseArray(int[] intArray, int size) {
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
    }

    public static void main(String[] args) {


        int[] intArray = {11, 22, 33, 44, 55, 66, 77, 88, 99, 00};
        reverseArray(intArray, intArray.length);
    }
}
