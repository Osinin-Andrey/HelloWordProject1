package by.osinin.classwork.lesson19;

import java.util.Random;

public class MyThread extends  Thread { //что бы сделать его потоком (родитель поток)
    public int getCount() {
        return count;
    }

    private int count;


    public MyThread(String name) {
        super(name);
    }
    @Override //альт + инсерт
    public void run() {
        System.out.println("Start of my thread with name " + getName());
        count = new Random().nextInt(); //просто что бы вывести число (добавили геттер)
        try {
            Thread.sleep(10000); //что бы уснул на 2сек.
        } catch (InterruptedException e) {

        }
        System.out.println("End of my thread with name " + getName());
    }
}
