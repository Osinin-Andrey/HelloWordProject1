package by.osinin.homework.lesson13.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader reader = new FileReader("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\numbers.txt");
             Scanner scanner = new Scanner(reader)) {

            Set<Integer> numbers = new HashSet<>(); // создаем HashSet для хранения чисел
            while (scanner.hasNextInt()) { //возвращает true если с потока ввода можно считать целое число
                numbers.add(scanner.nextInt()); //считывает целое число с потока ввода
            }
            for (int number : numbers) {
                System.out.println(numbers);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
