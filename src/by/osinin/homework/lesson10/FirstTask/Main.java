package by.osinin.homework.lesson10.FirstTask;

import java.util.Arrays;
import java.util.Locale;

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
        lettersAbc(document);
        numbers555(document);
        symbol1a2b(document);
    }

    private static void lettersSymbols(String document) {
        StringBuilder builder = new StringBuilder(document);
        builder.replace(5, 8, "***");
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
        //Вывести на экран только одни буквы из номера
        //документа в формате yyy/yyy/y/y в нижнем регистре.
    }

    private static void lettersToUpperCase(String document) {
        StringBuilder builder = new StringBuilder(document);
        System.out.println("Letters:" + builder.delete(0, 5).
                replace(3, 9, "/").
                replace(7, 9, "/").
                replace(9, 10, "/").
                toString().toUpperCase());
        //Вывести на экран буквы из номера документа в формате
        //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать
        //с помощью класса StringBuilder).
    }

    private static void lettersAbc(String document) {
        String LettersAbc = "ABC";
        if (document.contains(LettersAbc.toLowerCase()))
            System.out.println("Document has: " + LettersAbc.toLowerCase());
        else if (document.contains(LettersAbc.toUpperCase()))
            System.out.println("Document has: " + LettersAbc.toUpperCase());
        else {
            System.out.println("Document does not has: " + LettersAbc + " or " + LettersAbc.toLowerCase());
            //Проверить содержит ли номер документа последовательность abc
            //и вывети сообщение содержит или нет(причем, abc и ABC считается
            // одинаковой последовательностью).
        }
    }

    private static void numbers555 (String document) {
        String numbers555 = "555";
        if (document.startsWith(numbers555))
        System.out.println("Document has numbers 555 at first");
        else {
            System.out.println("Document does not has numbers 555 at first");
        }
        //Проверить начинается ли номер документа с последовательности 555.
    }

    private static void symbol1a2b (String document) {
        String symbol1a2b = "1a2b";
        if (document.endsWith(symbol1a2b))
            System.out.println("Document has symbol 1a2b at end");
        else {
            System.out.println("Document does not has symbol 1a2b at end");
        }
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
    }

}
