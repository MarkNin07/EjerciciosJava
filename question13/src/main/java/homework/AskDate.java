package homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class AskDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.print(date);
        System.out.println(" " + time);
    }
}
