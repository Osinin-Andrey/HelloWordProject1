package by.osinin.classwork.lesson7;

public interface Flyable {
     //int value = 0;
    void fly (); //метод
    void flyWithSound ();


    default void printMessage (){
        System.out.println("this is not informative message");
    }



}
