package by.osinin.classwork.lesson10;

public class ContainsExample {
    public static void main(String[] args) {
        String example = "This is my example";
        System.out.println(example.contains("my")); //проверить есть ли my в предложении.
        System.out.println(example.toLowerCase().contains("my")); //ищет и большое и маленькое my

    }
}
