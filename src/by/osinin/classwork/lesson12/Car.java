package by.osinin.classwork.lesson12;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 42L;
    private int price;
    private String name;

    public int getUnneededValue() {
        return unneededValue;
    }

    public void setUnneededValue(int unneededValue) {
        this.unneededValue = unneededValue;
    }

    private transient int unneededValue;

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' + unneededValue +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }
}
