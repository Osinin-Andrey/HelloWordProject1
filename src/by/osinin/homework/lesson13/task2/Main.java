package by.osinin.homework.lesson13.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader reader = new FileReader("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\numbers.txt");
             Scanner scanner = new Scanner(reader)) {

            while (scanner.hasNext()) { //пока в этом файле что-то есть, читай эти строчки
                System.out.println(scanner.nextLine());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
