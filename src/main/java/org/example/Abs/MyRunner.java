package org.example.Abs;

import java.util.Arrays;

public class MyRunner {
    public static void main(String[] args) {
        AbstractStudent student = new StudentService();

        student.setUsername("Mike123");

        student.setPassword("password1234567");

        student.setRollnumber(0024);

        student.dispalyinformation();

        String[] name = {"Mike", "Gabriel"};

        System.out.println(Arrays.toString(student.getFullName(name)));

    }
}
