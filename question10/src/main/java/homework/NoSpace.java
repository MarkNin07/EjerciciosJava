package homework;

import java.util.Scanner;

public class NoSpace {

    public static void main(String[] args) {
        String text;
        Scanner value = new Scanner(System.in);
        System.out.println("Please, type a text");
        text = value.nextLine();
        String noWhiteSpace = text.replaceAll("\\s+", "");
        System.out.println(noWhiteSpace);

    }
}
