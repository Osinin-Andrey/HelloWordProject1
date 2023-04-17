package by.osinin.homework.lesson6.ThirdTask;

public class Atm {
    private int twentyDollarsAmount;
    private int fiftyDollarsAmount;
    private int oneHundredDollasrsAmount;


    public Atm(int twentyDollarsAmount, int fiftyDollarsAmount, int oneHundredDollasrsAmount) {
        this.twentyDollarsAmount = twentyDollarsAmount;
        this.fiftyDollarsAmount = fiftyDollarsAmount;
        this.oneHundredDollasrsAmount = oneHundredDollasrsAmount;

    }

    public void insertedAtm() {
        System.out.println("Inserted the card into the ATM");
    }

    public void addAtmTwenty(int amount) {
        twentyDollarsAmount = twentyDollarsAmount + amount;
        System.out.println("Add twenty dollar bills: " + amount);
        System.out.println("Balance: " + twentyDollarsAmount);
    }

    public void addAtmFifty(int amount) {
        fiftyDollarsAmount = fiftyDollarsAmount + amount;
        System.out.println("Add fifty dollar bills: " + amount);
        System.out.println("Balance: " + fiftyDollarsAmount);
    }

    public void addAtmOneHundred(int amount) {
        oneHundredDollasrsAmount = oneHundredDollasrsAmount + amount;
        System.out.println("Add one hundred dollar bills: " + amount);
        System.out.println("Balance: " + oneHundredDollasrsAmount);
    }

    public void takeMoneyTwenty(int amount) {
        twentyDollarsAmount = twentyDollarsAmount - amount;
        System.out.println("Take twenty dollar bills: " + amount);
        System.out.println("Balance: " + twentyDollarsAmount);
        if (amount > 0) {
            System.out.println("Операция прошла успешно");
        } if (amount <= 0) {
            System.out.println("не успешно");
        }
        }


    }