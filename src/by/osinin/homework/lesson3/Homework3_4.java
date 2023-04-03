package by.osinin.homework.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int myValue = new Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess number:");
            int number = scanner.nextInt();
            if (number == myValue) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Not right! Try again!");

            }


        }
    }
}