package by.osinin.classwork.lesson13;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> secondString = new ArrayList<>();
        strings.add("first"); //добавление
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        secondString.add("forth");
        secondString.add("fifth");
        strings.addAll(secondString); //добавить все
        strings.add(2, "next"); //поставить некст на 2 позицию
        System.out.println(strings);
        System.out.println(strings.contains("44")); //для проверки 44 есть или нет
        System.out.println(strings.indexOf("next")); // для лежит некст
        System.out.println(strings.lastIndexOf("next")); // для лежит некст
        System.out.println(strings.isEmpty()); //пустая коллекция или нет
        System.out.println(strings.get(4));//что лежит в 4 позиции
        System.out.println(strings.remove("next")); //если хотим выкинуть некст
        System.out.println(strings.remove(4)); //выкинь 4 позицию
        System.out.println(strings.removeAll(secondString)); //выкинь всё из листа
        System.out.println(strings.set(1, "next")); //не добавить, а поменять 1 на некст
        System.out.println(strings.size()); //размер листа, сколько элементов
        System.out.println(strings.subList(1,3)); //вывести с 1 по 3 (индекс не включительно)
        System.out.println(strings);

        Collections.sort(secondString); //для сортировки
        System.out.println(secondString);
        Collections.reverse(secondString); //задом наперед
        System.out.println(secondString);

        Collections.shuffle(strings);//он перемешивает как карты
        System.out.println(strings);
        Collections.shuffle(strings);
        System.out.println(strings);

        for (String str: strings) { //пройтись по листу
            System.out.println(str);
        }
    }
}
