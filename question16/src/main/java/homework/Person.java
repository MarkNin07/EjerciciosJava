package homework;

public class Person {
    private String name = "";
    private int age = 0;
    private long ID = 0;
    private char gender = 'M';
    private double weight = 0;
    private double height = 0;

    public Person(){

    }

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, long ID, char gender, double weight, double height){
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void bodyMassIndex(float w, float h){
        int exponent = 2;
        double pow = Math.pow(h, exponent);
        double bmi = w / pow;
        final int IDEALWEIGHT = -1;
        final int LOWWEIGHT = 0;
        final int OVERWEIGHT = 1;

        if(bmi < 20){
            System.out.println(IDEALWEIGHT);
        }else if(bmi >= 20 || bmi <= 25){
            System.out.println(LOWWEIGHT);
        }else{
            System.out.println(OVERWEIGHT);
        }
    }

    public boolean isAnAdult(){
        if(age > 18){
            return true;
        }
        return false;
    }

    private void checkGender(char gender){
        if(!(gender == 'M')){
            this.gender = 'M';
        }
    }



}
