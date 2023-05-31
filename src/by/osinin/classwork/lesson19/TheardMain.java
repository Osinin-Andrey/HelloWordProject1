package by.osinin.classwork.lesson19;

public class TheardMain {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name); //имя текущего потока (main)
        Thread.currentThread().setName("My super name"); //изменить имя потока
        System.out.println("Thread name:" + Thread.currentThread().getName());
        System.out.println("is alive" + Thread.currentThread().isAlive()); //живой потом или не живой (работает или нет)
        System.out.println("is interrupted" + Thread.currentThread().isInterrupted()); //завершился или работает
        try {
            Thread.sleep(5000); // на сколько потоку надо уснуть (милисекунду)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println("Hello world 2");
    }
}
