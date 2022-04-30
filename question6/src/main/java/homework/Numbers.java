package homework;

public class Numbers {
    int number;

    public Numbers(int num){
        this.number = num;
    }

    public void oddNumbers(){
        if(this.number % 2 != 0){
            System.out.println(this.number + " this is an odd number");
        }
    }

    public void evenNumbers(){
        if(this.number % 2 == 0){
            System.out.println(this.number + " this is an even number");
        }
    }

    public static void main(String[] args) {
        int x;

        for(x=1; x<= 100; x++){
            Numbers evenOrOdd = new Numbers(x);
            evenOrOdd.oddNumbers();
            evenOrOdd.evenNumbers();
        }
    }

}
