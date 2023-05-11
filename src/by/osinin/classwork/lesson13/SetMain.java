package by.osinin.classwork.lesson13;

import jdk.jshell.PersistentSnippet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>(); //очень быстро найти
        Set<String> secondSet = new TreeSet<>(); //сохраняет по возрастанию всегда
        firstSet.add("aFirst");
        firstSet.add("bSecond");
        firstSet.add("cThird");
        System.out.println(firstSet.add("cThird")); //проверка вставил или не вставил строчку
        secondSet.add("aFirst");
        secondSet.add("aSecond");
        secondSet.add("aThird");
        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(firstSet.contains("first")); //есть там это значение или нет
        System.out.println(firstSet.isEmpty()); //пустой сет или не пустой
        System.out.println(firstSet.size()); //размер
        System.out.println(firstSet.remove("cThird")); //выкинуть какое-то значение
        System.out.println(firstSet.remove("hird")); //тут будет ошибка


        Set<Person> myPersonSet = new TreeSet<>(); //тут надо учить сортировать при помощи метода Compare
        myPersonSet.add(new Person("Andrey", "Osinin"));
        myPersonSet.add(new Person("Dima", "Osinin"));
        myPersonSet.add(new Person("Sveta", "Osinin"));
        System.out.println(myPersonSet);


    }
}
