package by.osinin.classwork.lesson3;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5));

        }
    }
}
