package by.osinin.classwork.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Homework4 {
    //домашка 4 занятие, 2 задача
    public static void main(String[] args) {
        List<Integer> arrs = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
        int x = 3; //в место 3 поставить 0
        List<Integer> resolt = arrs
                .stream()
                .map(val -> val == x ? 0 : val)
                .toList();
        System.out.println(resolt);

        //домашка 4 занятие, 2 задача
        System.out.println(IntStream
                .of(1, 2, 3, 1, 2, 3, 4, 5)
                .summaryStatistics());


        //домашка 4 занятие, 4 задача

        arrs.stream()
                .filter(z-> z%2 ==0)
                .forEach(z-> System.out.println(z));
    }
}
