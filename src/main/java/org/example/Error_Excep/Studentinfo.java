package org.example.Error_Excep;

import org.w3c.dom.ls.LSOutput;

public class Studentinfo {
    public void checkEligibility(int StAge, double StGpa) {
        if (StAge < 18 && StGpa < 2) {
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else
        {
        System.out.println("Student is eligible for registration");
}
    }
}
