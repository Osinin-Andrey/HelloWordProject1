package by.osinin.classwork.lesson15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {
    //Создать коллекцию класса ArrayList наполнить ее элементами
    //рандомными элементами типа Integer.
    //С помощью Stream'ов:
    //- Удалить дубликаты
    //- Вывести все четные элементы в диапазоне от 7 до 17
    //- Каждый элемент умножить на 2
    //- Отсортировать и вывести на экран первых 4 элемента
    //- Вывести количество элементов в стриме
    //- Вывести среднее арифметическое всех чисел в стриме
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //создал коллекцию
        for (int i = 0; i < 25; i++) { //заполняю рандомными числами от 0 до 20
            list.add((int) (Math.random() * 20));
            System.out.println(list); //вывожу какие числа получились
        }
        List<Integer> duplicateList = list.stream().distinct().collect(Collectors.toList()); //удалаяю дубликааты
        System.out.println("Delete duplicate: " + duplicateList);

        List<Integer> evenList = list.stream().filter(val -> val % 2 == 0 && val >= 7 && val <= 17).collect(Collectors.toList());
        //вывел все четные числа от 7 до 17
        System.out.println("Even numbers between 7 and 17: " + evenList);

        List<Integer> multiplicationList = evenList.stream().map(val ->val *2).collect(Collectors.toList());
        //умножил каждый элемент который выводится в evenList
        System.out.println("Elements *2: " + multiplicationList);

        List<Integer> sortingList = multiplicationList.stream().sorted().limit(4).collect(Collectors.toList());
        //Отсортировать и вывести на экран первых 4 элемента
        System.out.println("Sorting and displaying 4 elements : " + sortingList);

        long amountElements = sortingList.stream().count();
        //Вывел количество элементов в стриме
        System.out.println("amountElements " + amountElements);








    }
}
