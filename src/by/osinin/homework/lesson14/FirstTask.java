package by.osinin.homework.lesson14;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату дд.мм.уууу: ");
        String strDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = parse(strDate, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("День недели для " + strDate + " - " + dayOfWeek);





    }
}
