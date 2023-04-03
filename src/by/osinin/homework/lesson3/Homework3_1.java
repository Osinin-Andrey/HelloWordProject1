package by.osinin.homework.lesson3;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        int nubmer = scanner.nextInt();

        switch (nubmer) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("This is not right colour");


        }


    }
}
