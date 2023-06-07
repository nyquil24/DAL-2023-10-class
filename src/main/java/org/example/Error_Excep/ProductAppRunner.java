package org.example.Error_Excep;

public class ProductAppRunner {
    public static void main(String[] args) {
        ProductInfo obj = new ProductInfo();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
