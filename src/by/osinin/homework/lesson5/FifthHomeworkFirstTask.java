package by.osinin.homework.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FifthHomeworkFirstTask {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        //создал 3 мерный массив
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = random.nextInt(10);
                    //заполнил массивы случайными цифрами
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        //вывел полученный результат

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int number = scanner.nextInt();
        //выбранное число с консоли, для увеличения элементов массива


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] += number;
                    //С помощью циклов "пройти" по всему массиву и увеличить каждый
                    //элемент на заданное число.
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));


    }
}
