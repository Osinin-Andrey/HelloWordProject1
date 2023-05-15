package by.osinin.homework.lesson13.task1;

import java.util.*;

public class MainWords {
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

