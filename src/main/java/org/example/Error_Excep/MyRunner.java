package org.example.Error_Excep;

public class MyRunner {
    public static void main(String[] args) {
        try {
            //this try block calls th above method to handle the exception
            Example_Throw obj = new Example_Throw();
            obj.testMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
