package by.osinin.homework.lesson12;


import java.io.*;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {


        try (FileReader reader = new FileReader("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\document.txt");
             Scanner scanner = new Scanner(reader);
             FileWriter writer = new FileWriter("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\results.txt");
             FileWriter writer1 = new FileWriter("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\failed_results.txt")) {


            while (scanner.hasNext()) {
                String str = scanner.nextLine();

                if (str.length() >= 15 && (str.startsWith("docnum") || str.startsWith("contract"))) {
                    writer.write(str +"\n");
                } else {
                    writer1.write(str + "\n");
                }
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}