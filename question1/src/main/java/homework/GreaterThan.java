package homework;

public class GreaterThan {

    public static void main(String[] args) {
        double number1 = 3.5;
        double number2 = 2.7;

        if(number1 == number2){
            System.out.println("Both numbers are equal");
        }else if(number1 > number2){
            System.out.println("Number 1 is greater than number 2");
        }else{
            System.out.println("Number 2 is greater than number 1");
        }
    }
}
