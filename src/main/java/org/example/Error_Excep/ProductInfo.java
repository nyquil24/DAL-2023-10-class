package org.example.Error_Excep;

public class ProductInfo {
    public void productCheck(double weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("Product weight is low");
        }
    }
}
