package by.osinin.homework.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainReader {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\document.txt");
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) { //пока в этом файле что-то есть, читай эти строчки
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}