package by.osinin.homework.lesson6.FirstTask;

import by.osinin.homework.lesson6.FirstTask.CreditCard;

public class Main {
    public static void main(String [] args){
        //Создал объект
        CreditCard my = new CreditCard(1111, 5000);
        CreditCard my2 = new CreditCard(2222, 10000);
        CreditCard my3 = new CreditCard(3333, 15000);

        //Тестовый сценарий для проверки:
        my.tookCard();
        my.addSum(1000);
        my2.tookCard();
        my2.addSum(3000);
        my3.tookCard();
        my3.takeSum(4000);
        my.balance();
        my2.balance();
        my3.balance();





    }
}
