package by.osinin.classwork.lesson17;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        String testString = "This is my 1 test string, - 12345";
        String test2 = "12345";
        Pattern numbers = Pattern.compile("\\d+"); //задание шаблона для поиска (все цифры)
        Matcher numbersMatcher = numbers.matcher(testString); //с помощью шаблона искать, то что мы задали
        System.out.println(numbersMatcher.matches()); //соответствует ли строчка нашему поиску

        Matcher numbersMatcher2 = numbers.matcher(test2); //с помощью шаблона искать, то что мы задали
        System.out.println(numbersMatcher2.matches()); //соответствует ли строчка нашему поиску

        if (numbersMatcher.find()) { //find - мы даём команду найт что-то подходящее под наш шаблон
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end()); //даёт нам точное начала и конец подходящего куска строки
            System.out.println(numbersMatcher.group()); //возвращает этот кусок
            //найдёт 1
        }

//        while (numbersMatcher.find()) { //while - найти всё по кусочку по очереди
//            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end()); //даёт нам точное начала и конец подходящего куска строки
//            System.out.println(numbersMatcher.group()); //возвращает этот кусок
//        }
        numbersMatcher.reset(); //всё скидывает (что бы что-то другое искать)
        //numbersMatcher.usePattern(Pattern.compile("\\w+"));
        while (numbersMatcher.find()) {
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end()); //даёт нам точное начала и конец подходящего куска строки
            System.out.println(numbersMatcher.group()); //возвращает этот кусок
        }

        numbersMatcher.reset();
        numbersMatcher.results()
                .map(MatchResult::group)
                .map(String::length)
                .forEach(lenght-> System.out.println(lenght));







    }
}
