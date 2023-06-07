package org.example.Error_Excep;

public class StudentRunnerClass {
    public static void main(String[] args) {
        System.out.println("Welcome to the Registration process");
        Studentinfo st = new Studentinfo();
        st.checkEligibility(16, 1.6);
        System.out.println("Have a nice day..");
    }
}
