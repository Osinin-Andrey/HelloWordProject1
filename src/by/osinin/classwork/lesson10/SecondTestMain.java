package by.osinin.classwork.lesson10;

import java.util.Arrays;

public class SecondTestMain {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "THIS IS MY STRING";
        System.out.println(str.toLowerCase()); //все буквы с маленький пишет
        System.out.println(str.toUpperCase()); //все буквы с большой пишет
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.replace('i', 'a')); //меняет все буквы i на все буквы a
        System.out.println(str.contains("is")); //есть ли в строчке is спрашиваем
        System.out.println(str.indexOf("is")); //покажи в каком месте находится is сначала
        System.out.println(str.indexOf("is", 8)); //ищет is много раз с какой-то позиции (8). если -1 - ничего не нашло
        System.out.println(str.lastIndexOf("is")); //покажи в каком месте находится is c конца
        String str5 = " ";
        String str6 = null;

        System.out.println(str5.isEmpty()); //
        System.out.println(str5.isBlank()); //


        System.out.println(str.replaceFirst("is", "a")); //меняет is на A - 1 раз
        System.out.println(str.replaceAll("is", "a")); //меняет is на А - везде

        String str4 = "abra";
        int myVal = 125;
        String result = String.valueOf(myVal); // сделать из числа строчку
        String result2 = 125 + ""; // сделать из числа строчку
        System.out.println(result);
        System.out.println(result2);

        System.out.println(str4 + 2); //что соездить строчку с другим типом данных, например 2
        System.out.println(str4.repeat(5)); //склеить строчку 5 раз
        System.out.println(str4.startsWith("ab")); //начинается ли моя строчка с ab
        System.out.println(str4.endsWith("ab")); //заканчивается ли моя строчка на ab

        String[] myArr = str.split(""); //разделить пробелом в массиве предложение, получится 4 элемента
        System.out.println(Arrays.toString(myArr)); //




    }
}
