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
        bookList.add(new Book("Michael Bulgakov", "Master and Margarita", 1952));
        bookList.add(new Book("Michael Bulgakov", "Dog's heart", 1925));
        bookList.add(new Book("Lev Tolstoy", "War and Peace", 1863));
        bookList.add(new Book("Fedor Dostoevsky", "Idiot", 1868));
        bookList.add(new Book("Fedor Dostoevsky", "Notes from the House of the Dead", 1860));
        bookList.add(new Book("Ernest Hemingway", "The Old Man and the Sea", 1952));
        bookList.add(new Book("Ivan Turgenev", "Fathers and Sons", 1860));
        //1) отсортировать все книги по годам издания
        bookList.stream() //список книг преобразую в поток
                .sorted(Comparator.comparingInt(Book::getYear)) //метод сортед для сортировки книг по году
                .forEach(book -> System.out.println(book.getYear() + ", " + book.getWriter() + ", " + book.getNameBook()));
        //метод forEach для вывода книг в консоль

        Map<Integer, List<Book>> yearBook = bookList.stream()
                .collect(Collectors.groupingBy(Book::getYear));
        System.out.println(yearBook); //сгрупировал по годам

        Map<String, List<Book>> yearBook2 = bookList.stream()
                .collect(Collectors.groupingBy(Book::getWriter));
        System.out.println(yearBook2); //сгрупировал по писателям (дополнительно сделал)

        //2)собрать для каждого автора годы, в которые выходили его книги
        Map<String, List<Integer>> writerYears = bookList.stream()
                .collect(Collectors.groupingBy(Book::getWriter,
                        Collectors.mapping(Book::getYear, Collectors.toList())));
        System.out.println(writerYears); //собрал для каждого автора, годы

        Map<Integer, List<String>> writerYears2 = bookList.stream()
                .collect(Collectors.groupingBy(Book::getYear,
                        Collectors.mapping(Book::getWriter, Collectors.toList())));
        System.out.println(writerYears2); //собрал для каждого года, авторов

        //3) подсчитать количество книг, изданное по каждому году
        Map<Integer, Long> amountBook = bookList.stream()
                .collect(Collectors.groupingBy(
                        Book::getYear,
                        Collectors.counting()));
        System.out.println(amountBook);

        //4) посчитать для каждого автора количество книг
        Map<String, Long> amountWriter = bookList.stream()
                .collect(Collectors.groupingBy(
                        Book::getWriter,
                        Collectors.counting()));
        System.out.println(amountWriter);






    }
}

