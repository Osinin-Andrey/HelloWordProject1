package by.osinin.classwork.lesson13;

public class CollectionMain {
    public static void main(String[] args) {
        KeyStorage firstKey = new KeyStorage(11);
        System.out.println(firstKey);
        KeyStorage<String> secondKey = new KeyStorage<>("Abc"); //для строчки
        KeyStorage<Integer> thirdKey = new KeyStorage<>(111); //для числа
        System.out.println(secondKey);
        System.out.println(thirdKey);
    }
}
