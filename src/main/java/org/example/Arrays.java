package org.example;

public class Arrays {
    public static void main(String[] args) {

        double[] myList = new double[10]; //allocates memory for myList.
        myList[0] = 5;
        myList[9] = 2;
        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30, 31};

        for (int i = 0; i < month_days.length; i++) {
            System.out.println("The month " + months[i] + " has " + month_days[i] + " days.");
        }
        System.out.println(month_days.length);

        int[] numbers ={3,9,5, -5};

        // for each loop
        for(int number: numbers){
            System.out.println(number);
        }

}
    }

