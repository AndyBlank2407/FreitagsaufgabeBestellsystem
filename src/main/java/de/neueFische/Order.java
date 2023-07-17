package de.neueFische;

import java.util.*;

public class Order {

    private static int id = 0;
    //private HashMap<Integer, List<Product>> products = new HashMap<>();

    private ArrayList<Product> products = new ArrayList<>();


    public Order(ArrayList<Product> orderedProd) {
        this.products = orderedProd;
        id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }
}
