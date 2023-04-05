package by.osinin.homework.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Homework4_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
            System.out.println("Result: [" + i + "]=" + arr[i]);
        }
        System.out.println(Arrays.toString(arr)); //вывод массива в строчку
        //создал массив целых чисел случайным образом
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length) {
                arr[i] = 0;
                //поставил в массиве вместо указаного числа 0
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
