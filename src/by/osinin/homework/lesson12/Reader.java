package by.osinin.homework.lesson12;


import java.io.*;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter way to file: ");
        String file = scanner.nextLine();
        if (!new File(file).exists()) {
            throw new FileNotFoundException("File " + file + " doen`t exist");
        }

        try (FileReader reader = new FileReader(file);
             Scanner fileScanner = new Scanner(reader);
             FileWriter writer = new FileWriter("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\results.txt");
             FileWriter writer1 = new FileWriter("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\failed_results.txt")) {


            while (fileScanner.hasNext()) {
                String str = fileScanner.nextLine(); //что бы читало каждый файл
                if (isDocumentNameCorrect(str)) { //ктр+альт+м
                    writer.write(str + "\n");
                } else {
                    writer1.write(str + "\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static boolean isDocumentNameCorrect(String str) {
        return str.length() >= 15 && (str.startsWith("docnum") || str.startsWith("contract"));
    }
}