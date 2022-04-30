package homework;

import java.util.Scanner;

public class BuyProduct {
    float price;

    public BuyProduct (float price){
        this.price = price;
    }

    public double getPriceWithTax(){
        double tax = 0.21;
        double totalPrice = (this.price * tax) + this.price;
        return totalPrice;
    }

    public static void main(String[] args) {
        float cost;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the price of the product in GBP");
        cost = value.nextFloat();

        BuyProduct product = new BuyProduct(cost);
        System.out.println("The product costs " + product.getPriceWithTax() + " GBP");
    }
}
