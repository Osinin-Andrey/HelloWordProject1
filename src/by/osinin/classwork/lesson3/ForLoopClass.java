package by.osinin.classwork.lesson3;

import java.util.Random;

public class ForLoopClass {
    public static void main(String[] args) {
        int counter = 100;
        for (; counter > 0; counter--) {
            System.out.println("aaaa" + counter);
        }

        for (int x = 0; x < 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);

            }
        }
        for(int x = 0; x<100; x+=5){
            System.out.println(x);
        }

//        for (int x = 0; x<50; x++) {
//            System.out.println(2*x);
//        }
//        int count = 100;
//        while (count>0) {
//            System.out.println("count: " + count--);
//        }
//        do {
//            System.out.println("count again:" + count++);
//        } while (count<100);






    }
}
