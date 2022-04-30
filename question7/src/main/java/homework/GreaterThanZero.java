package homework;

import java.util.Scanner;

public class GreaterThanZero {


    public static void main(String[] args) {
        double num;
        Scanner value = new Scanner(System.in);

        do{
            System.out.println("Please, type a number");
            num = value.nextDouble();

        }while(num >= 0);
    }

}
