package homework;

public class Numbers {
    int number;

    public Numbers(int num){
        this.number = num;
    }

    public void oddNumbers(){
        if(number % 2 != 0){
            System.out.println(this.number + " This is an odd number");
        }
    }

    public void evenNumber(){
        if(number % 2 == 0){
            System.out.println(this.number + " This is an even number");
        }
    }

    public static void main(String[] args) {
        int x = 1;

        while(x <= 100){
            Numbers num = new Numbers(x);
            num.oddNumbers();
            num.evenNumber();
            x += 1;
        }
    }
}
