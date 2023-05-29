package by.osinin.classwork.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderExample {
    public static void main(String[] args) {
        List<Order> orders = getOrders();
        //найти яйца
        var result = orders
                .stream()
                .filter(isOrderWithEggs())
                .toList();
        System.out.println("Где яйца: " + result);

        //вывести список продуктов без дубликатов
        var products = orders.stream()
                .flatMap(getProductsStream())
                .distinct()
                .map(Product::getProductName)
                .toList();

        System.out.println("Список продуктов без дубликатов:" + products);
    }

    private static Function<Order, Stream<? extends Product>> getProductsStream() {
        return order -> order
                .getProducts()
                .stream();
    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order
                .getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product
                .getProductName()
                .equals("Eggs");
    }

    private static List<Order> getOrders() {
        List<Product> products = getFirstProductsList();

        List<Product> secondProducts = getSecondProducts();

        List<Product> thirdProducts = getThirdProducts();
        return Arrays.asList(new Order(1, products),
                new Order(2, secondProducts),
                new Order(3, thirdProducts));
    }

    private static List<Product> getThirdProducts() {
        return Arrays.asList(
                new Product("Honey", 10),
                new Product("Beer", 15),
                new Product("Suchi", 10));
    }

    private static List<Product> getSecondProducts() {
        return Arrays.asList(
                new Product("Bread", 25),
                new Product("Eggs", 15),
                new Product("Apples", 10));
    }

    private static List<Product> getFirstProductsList() {
        return Arrays.asList(
                new Product("Milk", 20),
                new Product("Eggs", 15),
                new Product("Sugar", 10));
    }
}
