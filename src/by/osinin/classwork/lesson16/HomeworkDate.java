package by.osinin.classwork.lesson16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeworkDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Give the date");
//        String date = sc.nextLine();
        //LocalDate localDate = LocalDate.parse(date, formatter);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //как найти день недели, число
        System.out.println(localDate.getDayOfWeek().getValue());
        var day = localDate.getDayOfWeek().getValue();
//        if (day == 1) {
//            System.out.println(localDate.plusDays(1));
//        } else {
//            System.out.println(localDate.plusDays(9 - day));
//        }
        if (day != 1) {
            day = 9-day;
        }
        System.out.println(localDate.plusDays(day));

        //6,7 как считать дни до выходных
        //6 - day > 0 -
         //       == 0
    }

}
