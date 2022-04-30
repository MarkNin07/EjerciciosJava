package homework;

import java.util.Locale;
import java.util.Scanner;

public class WorkDay {

    public static void main(String[] args) {
        String day;
        Scanner value = new Scanner(System.in);
        System.out.println("Type a day of the week");

        try{
            switch (day = value.nextLine().toUpperCase(Locale.ROOT)){
                case "MONDAY":
                case "TUESDAY":
                case "WEDNESDAY":
                case "THURSDAY":
                case "FRIDAY":
                    System.out.println("It's a workday");
                    break;
                case "SATURDAY":
                case "SUNDAY":
                    System.out.println("It's your day-off");
                    break;
                default:
                    System.out.println("Enter a valid day");
            }

        }catch(Exception e){
            System.out.println("Please, type a valid day");

        }
    }
}
