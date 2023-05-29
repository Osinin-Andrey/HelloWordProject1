package by.osinin.classwork.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExHomework {

    public static final String DEFAULT_DOCUMENT_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String NUMBERS_WITH_MINUS = "\\d+-?";
    public static final String LETTERS_BLOCK = "[a-z]{3}";
    public static final String EXTENDED_DOCUMENT_FORMAT = "(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d[a-z]){2}";

    //вроде 10 домашка
    public static void main(String[] args) {
        //номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где х - это число, а у - это буква
        Pattern documentPattern = Pattern.compile(DEFAULT_DOCUMENT_FORMAT);
        String testCse = "1234-abc-5678-def-9z0y";
        Matcher matcher = documentPattern.matcher(testCse);
        System.out.println(documentPattern.matcher(testCse).matches());
        if (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        System.out.println("First task: ");
        printFirstLetters(testCse);
        printWithOutLetters(testCse);
        printOnlyLetters(testCse);
        printIfDocumentStartsWithANmberThatLessThat150(testCse);

    }
    private static void printIfDocumentStartsWithANmberThatLessThat150(String str){
        Pattern pattern = Pattern.compile("[0-1]([0-4][0-9]|50).+");
        System.out.println(pattern.matcher(str).matches());
    }
    private static void printOnlyLetters(String str) {
        System.out.println(str
                .replaceAll(NUMBERS_WITH_MINUS, "")
                .replaceAll("-", "/"));
    }
    private static void printWithOutLetters(String str) {
        System.out.println(str.replaceAll(LETTERS_BLOCK, "***"));
    }

    private static void printFirstLetters(String str) {

        Pattern pattern = Pattern.compile(EXTENDED_DOCUMENT_FORMAT);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(1) + matcher.group(3));
        }
    }
    }


