package by.osinin.homework.lesson3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        printSum();
    }

    private static void printSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int chosenNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= chosenNumber; i++) {
            sum += i;
        }
        System.out.println("Sum:" + sum);
    }
}

