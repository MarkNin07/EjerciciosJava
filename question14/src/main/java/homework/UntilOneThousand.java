package homework;

import java.util.Scanner;

public class UntilOneThousand {
    int number;

    public UntilOneThousand(int num){
        this.number = num;
    }

    public int getNumber(){
        for(int i=this.number + 1; i <= 1000; i++){
            i++;
            System.out.println(i);
        }
        return this.number;
    }

    public static void main(String[] args) {
        int num;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a whole number ");
        num = value.nextInt();

        UntilOneThousand Numb = new UntilOneThousand(num);
        Numb.getNumber();
    }
}
