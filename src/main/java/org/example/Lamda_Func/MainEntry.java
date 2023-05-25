package org.example.Lamda_Func;

public class MainEntry{
Calc<Integer> add = new Calc<Integer>() {
        @Override
        public void compute(int[] num) {

            int summation =  0;
            for(int nums:num){
                summation += nums;
            }
            System.out.println(summation);
        }
    };

    Calc<Integer> sub = new Calc<Integer>() {
        @Override
        public void compute(int[] num) {

            int difference =  num[0];
            for(int i = 1; i < num.length; i++){
                 difference -= num[i];
            }
            System.out.println(difference);
        }
    };

    Calc<Integer> mult = new Calc<Integer>() {
        @Override
        public void compute(int[] num) {

            int product = 1;
            for(int i = 0; i < num.length; i++){
                product *= num[i];
            }

            System.out.println(product);
        }
    };
    Calc<Integer> divide = new Calc<Integer>() {
        @Override
        public void compute(int[] num) {

            double quotient =  num[0]/num[1];
            System.out.println(quotient);
        }
    };

}
