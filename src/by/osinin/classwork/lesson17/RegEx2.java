package by.osinin.classwork.lesson17;

import by.osinin.classwork.lesson8.Parent;
import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testString = asList("ABC", "abc", "f", "F", "", "a1a", "a11", "a.1", "a..1");
        //Pattern pattern = Pattern.compile("[a-z]");
        //Pattern pattern = Pattern.compile("[a-z]+"); все маленькие буквы
        //Pattern pattern = Pattern.compile("[a-z]*"); //от нуля до бесконечности маленьких букв
        //Pattern pattern = Pattern.compile("[a-z]?"); //или ноль или одна
        //Pattern pattern = Pattern.compile("[a-z]{2,3}"); //от двух до трех
        //Pattern pattern = Pattern.compile("[a-zA-Z]+"); //и маленькие и большие
        //Pattern pattern = compile("[a-z]+", CASE_INSENSITIVE); //и маленькие и большие (тоже самое что выше)
        //Pattern pattern = Pattern.compile("[^a-z]+"); //всё кроме маленьких
        //Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]"); //какая маленькая буква + цифра + маленькая буква
        //Pattern pattern = Pattern.compile("[a-z]+\\d+$"); //$ - искать в конце строчки
        //Pattern pattern = Pattern.compile("^[a-z]+\\d+"); //^ - искать в начале строчки
        //Pattern pattern = compile("[a-z]+\\.\\d+"); // искать с одной точкой
        //Pattern pattern = compile("[a-z]+.\\d+"); //теперь значит абсолютно любой символ
        Pattern pattern = compile("([a-z]+.)(\\d+)"); // () - 1 скобки первая группа и () 2 скобки вторая группа, то что делаем в if ниже

        testString.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            //System.out.println(str + " matcher? " + matcher.matches());
            if (matcher.find()) {
                System.out.println("First group: " + matcher.group(1));
                System.out.println("Second group: " + matcher.group(2));
            }
        });
    }
}
