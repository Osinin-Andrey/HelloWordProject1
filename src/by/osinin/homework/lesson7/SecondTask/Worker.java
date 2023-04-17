package by.osinin.homework.lesson7.SecondTask;

public class Worker implements Positionable {
    @Override
    public void printPosition() {
        System.out.println("This is worker");
        //вызывается генерейт-оверрайд, что бы у каждой
        // профессии можно было узнать его позицию через один метод
    }
}


