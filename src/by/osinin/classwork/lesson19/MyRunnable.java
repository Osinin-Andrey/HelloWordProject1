package by.osinin.classwork.lesson19;

public class MyRunnable implements Runnable {

    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        //System.out.println("Run from runnable!!!");
        for (int i=0; i<10000; i++) {
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
