package by.osinin.classwork.lesson19;

import java.time.LocalDateTime;



public class MyThreadName {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalDateTime.now()); //сколько сек работает программа
        MyThread thread1 = new MyThread("First");
        MyThread thread2 = new MyThread("Second");
        thread2.setPriority(Thread.MAX_PRIORITY); //приоритеты которые так себе работают
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("State: " + thread1.getState());
        MyThread thread3 = new MyThread("Third");
        thread3.setDaemon(true); //демон поток
        thread1.start(); //что бы запустить поток
        System.out.println(thread1.isAlive()); //живой поток или нет
        thread2.start();
        thread1.join(); //пока не закончит работу 1 поток, остальные не запустятся (наверное)
        System.out.println(thread1.isAlive()); //живой поток или нет
        thread3.start();
        //thread3.interrupt(); //что бы выключить поток (просим поток закрыться по возможности)
//        new Thread(() -> {
//            while (true) {
//            System.out.println("Hello world spam");
//        }
//        }).start();
        System.out.println("End: " + LocalDateTime.now());
        System.out.println(thread1.getCount()); //просто сгенерировало число



    }
}
