package by.osinin.homework.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class FirstTask {
    //Создать коллекцию класса ArrayList наполнить ее элементами
    //рандомными элементами типа Integer.
    //С помощью Stream ов:
    //- Удалить дубликаты
    //- Вывести все четные элементы в диапазоне от 7 до 17
    //- Каждый элемент умножить на 2
    //- Отсортировать и вывести на экран первых 4 элемента
    //- Вывести количество элементов в стриме
    //- Вывести среднее арифметическое всех чисел в стриме
    public static void main(String[] args) {
        List<Integer> numbers = getIntegers();
        List<Integer> duplicateList = numbers.stream().distinct().toList(); //удалаяю дубликааты
        System.out.println("Delete duplicate: " + duplicateList);

        List<Integer> evenList = numbers.stream().filter(val -> val % 2 == 0 && val >= 7 && val <= 17).toList();
        //вывел все четные числа от 7 до 17
        System.out.println("Even numbers between 7 and 17: " + evenList);

        List<Integer> multiplicationList = evenList.stream().map(val -> val * 2).toList();
        //умножил каждый элемент который выводится в evenList
        System.out.println("Elements *2: " + multiplicationList);

        List<Integer> sortingList = multiplicationList.stream().sorted().limit(4).toList();
        //Отсортировать и вывести на экран первых 4 элемента
        System.out.println("Sorting and displaying 4 elements : " + sortingList);

        long amountElements = sortingList.stream().count();
        //Вывел количество элементов в стриме
        System.out.println("amountElements " + amountElements);

        OptionalDouble averageNumber = sortingList.stream().mapToInt(Integer::intValue).average();
        //Вывел среднее арифмитическое чисел в стриме
        System.out.println("Average Number: " + averageNumber);


    }

    private static List<Integer> getIntegers() {
        List<Integer> numbers = new ArrayList<>(); //создал коллекцию
        for (int i = 0; i < 25; i++) { //заполняю рандомными числами от 0 до 20
            numbers.add((int) (Math.random() * 20));
            System.out.println(numbers); //вывожу какие числа получились
        }
        return numbers;
    }
}
