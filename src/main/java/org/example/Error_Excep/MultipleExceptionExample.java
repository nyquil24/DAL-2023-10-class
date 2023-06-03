package org.example.Error_Excep;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        int[] nums = {3,0,7,0};
        try {
            int x = nums[0] / nums[1]; // this will throw an ArithmeticException
            // int y = nums[10]; // this would throw an ArrayIndexOutOfBoundsException
            String s = null;
            //s.length();  // this will throw Nullpointexception
        }catch (ArithmeticException eAri) {
            System.out.println("Execution caught: numerator must be greater then zero " + eAri);
            eAri.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException eArr) {
            System.out.println("Execution caught: You are exceeding the array size " + eArr);
            eArr.printStackTrace();
        }catch (NullPointerException enull) {
            System.out.println("Execution caught: String length is Zero " + enull);
        }catch(Exception e) {
            System.out.println("Execution caught: You got an Error please try again" + e);
        }
        finally{
            System.out.println("finally block us always execute");
        }
    }
}
