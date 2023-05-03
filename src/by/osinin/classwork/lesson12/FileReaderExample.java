package by.osinin.classwork.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //Scanner scanner1 = new Scanner("abracadabra");
        //System.out.println(scanner1.next());
        try (FileReader reader = new FileReader("abc.doc");
             Scanner scanner2 = new Scanner(reader)) {

            while (scanner2.hasNext()) { //пока в этом файле что-то есть, читай эти строчки
                System.out.println(scanner2.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
