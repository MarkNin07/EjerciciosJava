package homework;

import java.util.Scanner;

public class CompareStrings {
    String sentenceOne;
    String sentenceTwo;

    public CompareStrings (String stn1, String stn2){
        this.sentenceOne = stn1;
        this.sentenceTwo = stn2;
    }

    public Boolean compareStr(){
        boolean str = this.sentenceOne.equals(this.sentenceTwo);
        return str;
    }

    public static void main(String[] args) {
        String text1, text2;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter your first sentence");
        text1 = value.nextLine();
        System.out.println("Enter your second sentence");
        text2 = value.nextLine();

        CompareStrings compare = new CompareStrings(text1, text2);
        System.out.println("Are both sentences equal? " + compare.compareStr());
    }
}
