package BookExercises;

import java.util.SortedMap;

public class Start {
    public static void main(String[] args) {
//        int x = 0;
//        System.out.println("Перед началом цикла");
//        while (x < 40) {
//            System.out.println("Значение x равно" + x);
//            x = x + 5;
//        }
//        System.out.println("После окончания цикла");

        //        int x = 0;
//        System.out.println("Перед началом цикла");
//        while (x<40); {
//            System.out.println("В начале цикла");
//            System.out.println("Значение Х:" + x );
//            x = x+5;
//        }
//        System.out.println("После окончания цикла");


//        int x = 3;
//        if (x == 3) {
//            System.out.println("Х равно 3");
//        } else {
//            System.out.println("X не равен 3");
//        }
//        System.out.println("готово");
//int x =1;
//while (x<3) {
//    System.out.print("Doo");
//    System.out.print("Bee");
//    x = x + 1;
//}
//if (x==3); {
//            System.out.print("Do");
//}
//        int BeerNum = 99;
//        String word = "Бутылок";
//        while (BeerNum > 0) {
//
//            if (BeerNum ==1) {
//                word = "бутылка";
//            }
//            System.out.println(BeerNum + word + "пива на стене");
//            System.out.println(BeerNum + word + "пива");
//            System.out.println("Возьми одну");
//            System.out.println("Пусти по кругу");
//            BeerNum = BeerNum-1;
//
//            if (BeerNum>0) {
//
//            }
//            else {
//                System.out.println("Нет бутылок пива на стене");
//
//            }
//        }
//        //Массивы
//        String[] wordListOne = {"Круглосуточный", "Красивый", "Умный", "Мобрый", "Милый", "Сильный", "Слабый", "Уверенный", "Трус", "Крутой", "Лампа"};
//        String[] wordListTwo = {"Машина", "Телефон", "Работа", "Пейджер", "Календарь", "Такси", "Колонки", "Принтер", "Мышка", "Монитор", "Листик"};
//        String[] wordListThree = {"Ручка", "Карандаш", "Молодец", "Старый", "Розетка", "Провод", "Клей", "Подставка", "Стирка", "Пол", "Билет"};
//
//        int OneLenght = wordListOne.length;
//        int TwoLenght = wordListTwo.length;
//        int ThreeLenght = wordListThree.length;
//
//        int rand1 = (int) (Math.random()* OneLenght);
//        int rand2 = (int) (Math.random()*TwoLenght);
//        int rand3 = (int) (Math.random()*ThreeLenght);
//
//        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree[rand3];
//
//        System.out.println("Вот какая же интересная фраза получилась:" + phrase);

//        int x = 3;
//        while (x>0) {
//            if (x > 2) {
//                System.out.print("a");
//            }
//            x = x - 1;
//            System.out.print("-");
//            if (x == 2) {
//                System.out.print("b c");
//            }
//            if (x == 1) {
//                System.out.print("d");
//                x = x - 1;
//            }
//        }
        int x = 0;
        int y = 0;
        while (x<5) {
            y = x-y;
            System.out.print (x + "" + y + " ");
            x=x+1;
        }

    }

}

