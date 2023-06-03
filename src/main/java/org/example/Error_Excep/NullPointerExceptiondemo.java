package org.example.Error_Excep;

public class NullPointerExceptiondemo {
    public static void main(String[] args) {
        //Initializing String variable with null value

        String ptr = null;

        // checking if ptr.equals null or works fine.
        try
        {
            //this line of code throws NullPointerException
            //because ptr is null
            if(ptr.equals("hello"))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException Caught => " + e.getMessage());
        }
    }
}
