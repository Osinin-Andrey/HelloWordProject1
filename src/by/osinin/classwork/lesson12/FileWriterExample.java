package by.osinin.classwork.lesson12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("abc.doc", true);) { //true - запиши в конец
            writer.write("this is my string\n"); //записать в документ
            writer.flush(); //записать строчку (сохранение, всё что до этой строчки)
            writer.write("this is my second string\n"); //записать в документ
            writer.write("this is my second string\n");
            //writer.close(); //надо закрывать, что бы записало в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
