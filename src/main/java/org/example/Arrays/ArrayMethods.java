package org.example.Arrays;

import java.io.*;
import java.util.*;
import java.util.Arrays;


public class ArrayMethods {
    public static void main(String[] args) {
//        String myString[]={
//                "Omar", "Ezra", "Shameena",
//                "Ruby", "Skyler","Daisy",
//                "Sean", "Manish", "Safaa",
//                "Kiran", "Yanzhi", "Maneesha",
//                "Nequil","Flora"
//        };

        //Arrays.toString()

//        boolean[] boolArr = {true, true, false, true};
//        byte[] byteArr = {10,20,30};
//        char[] charArr = {'g','e','e','k','s'};
//        double[] doubleArr = {1, 2, 3, 4};
//        float[] floatArr = {11,21,31,41};
//        int[] intArr = {12,22,32,42};
//        long[] longArr = {13,23,33,43};
//        short[] shortArr = {14,24,34,44};
//        System.out.println(Arrays.toString(boolArr));
//        System.out.println(Arrays.toString(byteArr));
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(doubleArr));
//        System.out.println(Arrays.toString(floatArr));
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(longArr));
//        System.out.println(Arrays.toString(shortArr));

        //Arrays.fill() methods can fill/insert an array with a given value.

//        double[] dValues = new double[100];
//        Arrays.fill(dValues, 50.0); // set all values to 50
//        System.out.println(dValues[7]);
//
//        long[] lValues = new long[500];
//        Arrays.fill(lValues, 2057); // set all values to 2057
//        System.out.println(lValues[9]);
//
//
//        // int array example
//        int arr[] = {10, 20, 30, 40, 50};
//        System.out.println("Original = " + Arrays.toString(arr));
//
//        Arrays.fill(arr,99);
//        System.out.println("After filling = " + Arrays.toString(arr));
//
//        Arrays.fill(arr, 0, 3, 88);
//        System.out.println("After filling first 3 elements = " + Arrays.toString(arr));


        //Summing all Elements in Array
        int[] numbers = {3,4,5,-5,0,12};
        int sum = 0;

        //iterating through each element of the array
        for(int number: numbers){
            sum += number;
        }

        System.out.println( "Sum = " + sum);
    }
}
