package homework;

import java.util.Scanner;

public class HowManyVowels {
    String sentenceL;

    public HowManyVowels(String stn){
        this.sentenceL = stn;
    }

    public int sentenceLength(){
        int amount = this.sentenceL.length();
        return amount;
    }

    public int vowelA(){
        int countA  = 0;

        for(int i=0; i<this.sentenceL.length(); i++){
            if(String.valueOf(this.sentenceL.charAt(i)).equals("a")){
                countA++;
            }
        }
        return countA;
    }

    public int vowelE(){
        int countE  = 0;

        for(int i=0; i<this.sentenceL.length(); i++){
            if(String.valueOf(this.sentenceL.charAt(i)).equals("e")){
                countE++;
            }
        }
        return countE;
    }

    public int vowelI(){
        int countI  = 0;

        for(int i=0; i<this.sentenceL.length(); i++){
            if(String.valueOf(this.sentenceL.charAt(i)).equals("i")){
                countI++;
            }
        }
        return countI;
    }

    public int vowelO(){
        int countO  = 0;

        for(int i=0; i<this.sentenceL.length(); i++){
            if(String.valueOf(this.sentenceL.charAt(i)).equals("o")){
                countO++;
            }
        }
        return countO;
    }

    public int vowelU(){
        int countU  = 0;

        for(int i=0; i<this.sentenceL.length(); i++){
            if(String.valueOf(this.sentenceL.charAt(i)).equals("u")){
                countU++;
            }
        }
        return countU;
    }


    public static void main(String[] args) {
        String text;
        Scanner value = new Scanner(System.in);
        System.out.println("Please, enter a sentence");
        text = value.nextLine();

        HowManyVowels sentence = new HowManyVowels(text.toLowerCase());
        System.out.println(sentence.sentenceLength());
        System.out.println("The amount of vowel a is: " + sentence.vowelA());
        System.out.println("The amount of vowel e is: " + sentence.vowelE());
        System.out.println("The amount of vowel i is: " + sentence.vowelI());
        System.out.println("The amount of vowel o is: " + sentence.vowelO());
        System.out.println("The amount of vowel u is: " + sentence.vowelU());

    }
}
