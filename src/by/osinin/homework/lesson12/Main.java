package by.osinin.homework.lesson12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\document.txt");

        String text = "docnum123456789 \ncontract9876543 \n1111111 \n22222222";
        fileOutputStream.write(text.getBytes());
        fileOutputStream.close();
    }


}
