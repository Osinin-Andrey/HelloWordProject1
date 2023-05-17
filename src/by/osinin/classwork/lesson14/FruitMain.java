package by.osinin.classwork.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Apple", 10, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("Peach", 25, "Yellow"));
        fruits.add(new Fruit("Banana", 25, "Yellow"));
        System.out.println(filterFruitsByColor(fruits));
        System.out.println(filterFruitsByWeight(fruits));
        System.out.println(filterFruitsByName(fruits));
        Predicate<Fruit> colorPrdicate = fruit -> fruit.getColor().equals("Yellow");
        Predicate<Fruit> weightPrdicate = fruit -> fruit.getWeight() > 15;
        Predicate<Fruit> namePrdicate = fruit -> fruit.getName().length() > 5;

        //предикат - что-то даём, возращает true или false
        //консюмер - что-то даём, ничего не возращает
        Consumer<String> myStringConsumer = s -> System.out.println(s);
        //printNeededFruits(fruits, myStringConsumer);
        Consumer<Fruit> bananaConsumer = fruit -> {
            if (fruit.getName().equals("Banana")){
                System.out.println("we print only bananas");
                System.out.println(fruit);
            }
        };

        Consumer<Fruit> bigFruitConsumer = fruit -> {
            if (fruit.getWeight() > 20) {
                System.out.println("we print only big bananas");
                System.out.println(fruit);
            }
        };
        printNeededFruits(fruits, bananaConsumer);
        System.out.println(filterFruits(fruits, colorPrdicate));
        System.out.println(filterFruits(fruits, weightPrdicate));
        System.out.println(filterFruits(fruits, namePrdicate));
        System.out.println(filterFruits(fruits, fruit -> fruit.getWeight()>20 && fruit.getColor().equals("Yellow")));
    }

private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer) {
        for (Fruit fruit: fruits) {
            fruitConsumer.accept(fruit);
        }
}
    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> resolt = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (predicate.test(fruit)) {
                resolt.add(fruit);
            }
        }
        return resolt;

    }


    private static List<Fruit> filterFruitsByColor(List<Fruit> fruits) { //сортировка фруктов по цвету
        List<Fruit> resolt = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals("Yellow")) {
                resolt.add(fruit);
            }
        }
        return resolt;

    }

    private static List<Fruit> filterFruitsByWeight(List<Fruit> fruits) { //сортировка фруктов по весу
        List<Fruit> resolt = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getWeight() > 15) {
                resolt.add(fruit);
            }
        }
        return resolt;
    }

    private static List<Fruit> filterFruitsByName(List<Fruit> fruits) { //сортировка фруктов по имени
        List<Fruit> resolt = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().length() > 5) {
                resolt.add(fruit);
            }
        }
        return resolt;
    }

}