package org.example.Error_Excep;

public class ArrayIndexOutOfBoundsExceptiondemo {
    public static void main(String[] args) {
        try {
            String[] st = {"A","B","C","D","E"};
            st[11] = "X";
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index position is not exsits --> " + e.getMessage());
            //e.printStackTrace();
        }
        finally{
            System.out.println("this the finally block");
        }

    }
}
