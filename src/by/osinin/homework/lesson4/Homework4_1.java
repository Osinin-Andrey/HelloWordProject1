package by.osinin.homework.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums[i] = random.nextInt(10);
            System.out.println("nums[" + i + "]=" + nums[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (number == nums[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Число не встречается");
        } else {
            System.out.println("Число встречается " + count + " раз");
        }
    }
}