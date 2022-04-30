package homework;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("****** FILM MANAGEMENT ********");
        System.out.println("1) New Actor");
        System.out.println("2) Search Actor");
        System.out.println("3) Delete Actor");
        System.out.println("4) Edit Actor");
        System.out.println("5) Check all of the actors");
        System.out.println("6) Watch movies");
        System.out.println("7) See Categories of Actors movies");
        System.out.println("8) Quit");

        String options = null;
        Scanner value = new Scanner(System.in);

        try{
            System.out.println("Choose your option");
            options = value.nextLine();
            do{
                switch (options){
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                        //Come back to the menu
                        break;

                    default:
                        System.out.println("Enter a valid number");
                        break;
                }

            }while(!options.equals("8"));

        }catch(Exception e){
            System.out.println("Enter a valid number");
        }
    }
}
