package by.osinin.classwork.lesson19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private int count;
    private AtomicInteger intCount; //гетер и сетер одной операцией
    private final Object lock = new Object();
    private volatile int counter; //

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//    public synchronized void increment() throws InterruptedException { //синхронизация
//        setCount(getCount() + 1);
//        System.out.println("egegei");
//        Thread.sleep(1000);
//    }

    public void increment() throws InterruptedException { //синхронизация
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        intCount.incrementAndGet();
        intCount.addAndGet(10);
        intCount.decrementAndGet();
        intCount.getAndIncrement();
        System.out.println("egegei");
        Thread.sleep(100);
    }


}
