package by.osinin.homework.lesson16.firstTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookSorting {
    public static void main(String[] args) {
        //Итак, у нас есть класс Book, в котором указан автор, название книги и год издания.
        //И есть список таких книг.
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Michael Bulgakov", "Master and Margarita", 1966));
        bookList.add(new Book("Michael Bulgakov", "Dog's heart", 1925));
        bookList.add(new Book("Lev Tolstoy", "War and Peace", 1863));
        bookList.add(new Book("Fedor Dostoevsky", "Idiot", 1868));
        bookList.add(new Book("Fedor Dostoevsky", "Notes from the House of the Dead", 1860));
        bookList.add(new Book("Ernest Hemingway", "The Old Man and the Sea", 1952));
        bookList.add(new Book("Ivan Turgenev", "Fathers and Sons", 1862));
        //1) отсортировать все книги по годам издания
        bookList.stream() //список книг преобразую в поток
                .sorted(Comparator.comparingInt(Book::getYear)) //метод сортед для сортировки книг по году
                .forEach(book -> System.out.println(book.getYear() + ", " + book.getWriter() + ", " + book.getNameBook()));
        //метод forEach для вывода книг в консоль

        Map <Integer, List<Book>> yearBook = bookList.stream()
                .collect (Collectors.groupingBy(Book::getYear,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
        System.out.println(yearBook);

        Map<String, List<Integer>> writerYears = bookList.stream()
                .collect(Collectors.groupingBy(Book::getWriter,
                        Collectors.mapping(Book::getYear, Collectors.toList())));
        System.out.println(writerYears);


    }
}
