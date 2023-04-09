package by.osinin.homework.lesson6.FirstTask;

import java.util.SortedMap;

public class CreditCard {
    private long numberCard;
    private int sumOnCard;

    //методы
    public CreditCard(long numberCard, int sumOnCard) {
        this.numberCard = numberCard;
        this.sumOnCard = sumOnCard;
    }
    public void tookCard () {
        System.out.println("Took the card with a number: " + numberCard);
    }

    public void addSum (int sum) {
        sumOnCard = sumOnCard + sum;
        System.out.println("Add sum on card: " + sum);
    }

    public void takeSum (int sum) {
        sumOnCard = sumOnCard - sum;
        System.out.println("Take sum with card: " + sum);
    }
    public void balance () {
        System.out.println("Finish balance: " + sumOnCard);
    }





}
