package by.osinin.homework.lesson13.ThirdTask;

import java.util.*;
//С консоли задать 10 съедобных предметов с указанием их категории,
//например пусть будут три категории - «ягоды», «овощи» и «фрукты»,
//и с консоли сначала выбираете категорию, потом пишете название предмета.
// (например ягоды — арбуз, овощи — огурец, фрукты — персик). После того,
// как все введены, вывести их на печать по очереди по каждой категории,
// т. е. ягоды отдельно, овощи отдельно и фрукты отдельно.

public class ThirdTask {
    public static void main(String[] args) {
        Map<String, List<String>> foodMap = new HashMap<>(); //создаю коллекцию из Мап и Лист
        List<String> vegetables = new ArrayList<>(); //коллекция лист для овощей
        List<String> fruits = new ArrayList<>(); //коллекция лист для фркутов
        List<String> berries = new ArrayList<>(); //коллекция лист для ягод
        for (int i = 0; i < 10; i++) { //созадется фор для заполение коллекций до 10 штук
            System.out.println("Please, enter the name of food: "); //прошу ввезти название еды
            Scanner scanner = new Scanner(System.in); //для сохранения данных
            String strFood = scanner.nextLine(); //создал строчку еда для заполнения свича
            System.out.println("What do you wrote?" + " 1)Vegetables " + " 2)Fruits " + " 3)Berries");
            int numOfFood = scanner.nextInt(); // создал число для заполнения свича
            switch (numOfFood) {
                case 1 -> vegetables.add(strFood); // если 1 в овощи
                case 2 -> fruits.add(strFood); // если 2 в фрукты
                case 3 -> berries.add(strFood); // если 3 в ягоды
            }
        }
        foodMap.put("Vegetables", vegetables); //сложить в коллекцию овощи
        foodMap.put("Fruits", fruits); //сложить в коллекцию фрукты
        foodMap.put("Berries", berries); //сложить в коллекцию ягоды
        System.out.println(foodMap); //вывод

    }
}
