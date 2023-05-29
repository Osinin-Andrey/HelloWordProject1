package by.osinin.homework.lesson13.FirstTask;

import java.util.*;

public class MainWords {
    //1. Дан текст, нужно прочитать все введенные в нем слова, и вывести их в алфавитном порядке.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        String[] myArr = text.split(" ");
        List<String> arrWords = new ArrayList<>(Arrays.asList(myArr));
        Collections.sort(arrWords);
        System.out.println(arrWords);
    }

}

