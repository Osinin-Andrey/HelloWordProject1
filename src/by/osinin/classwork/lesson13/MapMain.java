package by.osinin.classwork.lesson13;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>(); // очень быстро найти на ключу значение
        Map<Integer, String> secondMap = new TreeMap<>(); // делает ключи по возрастанию
        firstMap.put(1, "red"); // если спросят ключ - 1 верну ред
        firstMap.put(2, "orange");
        firstMap.put(3, "Yellow");
        firstMap.put(1, "next"); //если нужно переписать значение, пишем опять 1.

        System.out.println(firstMap.get(2)); //дайте мне цвет с номером 2
        System.out.println(firstMap.get(4)); //дайте мне цвет с номером 4 (null - такого нет)
        secondMap.put(1, "red");
        secondMap.put(2, "orange");
        secondMap.put(3, "Yellow");
        System.out.println(firstMap.containsKey(3)); //спрашиваем есть ли такое значение
        System.out.println(firstMap.isEmpty()); //проверяем пустая или не пустая
        System.out.println(firstMap.size()); //сколько ключей есть у нашей мепки
        //System.out.println(firstMap.remove(3)); //удали 3 ключ
        System.out.println(firstMap.keySet()); //дай нам все ключи которые у тебя есть
        System.out.println(firstMap.values());//посмотреть, что там сохранено, 2 часть
        System.out.println(firstMap); //как вывести на экран Мепку

        for (Integer key: firstMap.keySet()) {
            System.out.println(firstMap.get(key)); //красиво выводим элементы
        }
        firstMap.forEach((k,v) -> System.out.println(k + " " + v)); //красиво выводим элементы

        List<Integer> integer;
        List<List<Integer>> integers2;
        Map<String, List<String>> myMap = new HashMap<>();
        //computers (Lenovo, Asus);
        //phones (Samsung, Iphone);

        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");

        List<String> phones = new ArrayList<>();
        phones.add("Samsung");
        myMap.put("computers", computers);
        myMap.put("phones", phones);
        myMap.get("phones").add("Iphone"); //дописывает другое значение

    }
}
