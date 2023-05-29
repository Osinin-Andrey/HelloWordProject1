package by.osinin.classwork.lesson16;

import java.util.List;

public class Order {
    private int id;
    private List<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }
}
