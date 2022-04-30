package homework;

import java.util.Scanner;

public class CircleArea {
    double radio;
    int power = 2;

    public CircleArea(double r){
        this.radio = r;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(this.radio, power);
        return area;
    }

    public static void main(String[] args) {

        double radio;
        Scanner value = new Scanner(System.in);
        System.out.println("Please, enter the circle radio in cm");
        radio = value.nextDouble();

        CircleArea area = new CircleArea(radio);
        System.out.println("The area of the circle is: " + area.getArea() + " cm");
    }

}
