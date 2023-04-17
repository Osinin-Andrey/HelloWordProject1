package by.osinin.homework.lesson7.SecondTask;
//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.printPosition();
        Director director = new Director();
        director.printPosition();
        Accountant accountant = new Accountant();
        accountant.printPosition();


    }
}
