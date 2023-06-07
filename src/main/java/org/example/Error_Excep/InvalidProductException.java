package org.example.Error_Excep;

public class InvalidProductException extends Exception{
    public InvalidProductException(String s){
        // Call constructor of parent Exception
        super(s);
    }
}
