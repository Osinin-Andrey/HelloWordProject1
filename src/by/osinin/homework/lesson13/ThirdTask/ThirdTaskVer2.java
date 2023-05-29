package by.osinin.homework.lesson13.ThirdTask;

import java.util.*;

public class ThirdTaskVer2 {
    public static void main(String[] args) {
        Map<String, List<String>> products = new HashMap<>();
        products.put("fruits", new ArrayList<>());
        products.put("vegetables", new ArrayList<>());
        products.put("berries", new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        System.out.println("What category?" + " vegetables " + " fruits " + " berries");
        String foodCategory = scanner.nextLine();
        List<String> categoryProducts = products.get(foodCategory);
        if (categoryProducts == null) {
            System.out.println("No this category!");
        } else {
            System.out.println("Please, enter the name of food: ");
            String food = scanner.nextLine();
            categoryProducts.add(food);
        }
    }
}
