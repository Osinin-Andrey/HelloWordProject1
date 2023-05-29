package by.osinin.classwork.lesson12;

import javax.print.Doc;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        //File file = new File("abc.doc");
        File file = new File("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject\\out2\\abc3.doc");
        File file2 = new File("out2");
        String str = "hello \n world"; //n новая строчка
        System.out.println(str);
        System.out.println(file.exists()); //есть ли такой файл (есть в корневой папке)
        System.out.println(file.isFile()); //это вообще файл или нет?
        System.out.println(file.isDirectory()); //это папка?
        System.out.println(file2.isDirectory());//это папка?
        file2.mkdirs(); //создать пустую папку out2
        System.out.println(file.isHidden()); //скрытый файл или нет?
        System.out.println(file.getAbsolutePath()); //
        System.out.println(file.getCanonicalPath());
        System.out.println(file.delete());
        System.out.println(file.getParent()); //узнать кто у него родитель
        System.out.println(new File(file.getParent()).getParent());
        File file3 = new File("C:\\Users\\Epson\\IdeaProjects\\HelloWordProject");
        System.out.println(Arrays.toString(file3.listFiles(new DocFilter()))); //вывести все файлы по фильтру .doc
        System.out.println(Arrays.toString(file3.listFiles())); //вывести все файлы по фильтру
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());

        try {
            System.out.println(file.createNewFile());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getUsableSpace()); //сколько места есть свободного (наверное)
            System.out.println(file.renameTo(new File("abc4.doc"))); //переименовать файл
            System.out.println(file.setReadOnly());//можно ли читать файл
            System.out.println(file.setWritable(true)); //можно ли его перезаписать
            System.out.println(file.setWritable(false));

            System.out.println(file.lastModified()); //когда дата менялась
        } catch (IOException e) {
            System.out.println("File is not created by some reason: " + e);
        }
        System.out.println(file.delete()); //удаляет файл с папки out2


    }
}
