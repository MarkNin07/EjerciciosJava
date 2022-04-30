package homework;

import java.util.Scanner;

public class CompareNumbers {
    double num1;
    double num2;

    public CompareNumbers(double numberOne, double numberTwo){
        this.num1 = numberOne;
        this.num2 = numberTwo;
    }

    public double equalNumbers() {
       return this.num1;
    }

    public double greaterThan(){
        return this.num1;
    }

    public static void main(String[] args) {

        double number1, number2;
        Scanner value = new Scanner(System.in);
        System.out.println("Please, type your first number");
        number1 = value.nextDouble();
        System.out.println("Please, type your second number");
        number2 = value.nextDouble();

        CompareNumbers number = new CompareNumbers(number1, number2);

        if(number1 == number2){
            System.out.println("Both numbers are equal to: " + number.equalNumbers());
        }else if(number1 > number2){
            System.out.println("Your first number " + number.greaterThan() + " is greater than " + number2);
        }else{
            System.out.println("Your second number " + number2 + " is greater than " + number1);
        }
    }
}
