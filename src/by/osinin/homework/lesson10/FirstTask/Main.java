package by.osinin.homework.lesson10.FirstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String document = "1234-aBc-5678-DiF-9j0K";
        System.out.println();
        String[] arr = document.split("-");
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[0] + " " + arr[2]);
        //Вывести на экран в одну строку два первых блока по 4 цифры.
        lettersSymbols(document);
        lettersSymbolsTwo(document);
        lettersToLowerCase(document);
        lettersToUpperCase(document);
}
    private static void lettersSymbols(String document) {
        StringBuilder builder = new StringBuilder (document);
        builder.replace(5,8, "***");
        System.out.println(builder.replace(14, 17, "***"));
        //Вывести на экран номер документа, но блоки из трех букв
        // заменить на *** (каждая буква заменятся на *).
    }

    private static void lettersSymbolsTwo(String document) {
        System.out.println(document.replaceAll("[a-zA-Z]{3}", "***"));
        //или такой способ нашёл в интернете, самый удобный по идее
        // Вывести на экран номер документа, но блоки из трех букв
        // заменить на *** (каждая буква заменятся на *).
    }

    private static void lettersToLowerCase(String document) {
        System.out.println(document.replaceAll("[0-9]{4}", "+").
                replaceAll("[0-9-+]+{1}", "/").
                replaceFirst("/", "").
                toLowerCase());
    }

    private static void lettersToUpperCase(String document) {
        StringBuilder builder = new StringBuilder(document);
        System.out.println("Letters:" + builder.delete(0, 5).
                replace(3, 9, "/").
                replace(7, 9, "/").
                replace(9, 10, "/").
                toString().toUpperCase());
    }


}
