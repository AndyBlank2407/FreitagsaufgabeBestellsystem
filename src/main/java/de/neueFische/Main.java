package de.neueFische;

import java.util.ArrayList;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product("Chicken", 1);
        Product prod2 = new Product("Beef", 2);
        Product prod3 = new Product("Meat", 3);
        Product prod4 = new Product("Mushrooms", 4);

        ArrayList<Product> thingsToOrder = new ArrayList<Product>();
        thingsToOrder.add(prod3);
        thingsToOrder.add(prod4);

        ArrayList<Product> thingsToOrder2 = new ArrayList<>();
        thingsToOrder2.add(prod1);
        thingsToOrder2.add(prod2);

        ShopService shopService = new ShopService();
        shopService.makeOrder(thingsToOrder);
        shopService.makeOrder(thingsToOrder2);

        System.out.println(shopService.orderRepo.getAllOrders());
    }
}