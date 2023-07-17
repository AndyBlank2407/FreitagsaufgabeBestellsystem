package de.neueFische;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private Map<Integer, Product> products = Map.of(1, new Product("Apfel", 1), 2, new Product("Birne",
            2), 3, new Product("Karotte", 3));

    public Product getProductById(int id) {
        return this.products.get(id);
    }

    public ArrayList<Product> getAllProducts() {
        return new ArrayList<Product>(products.values());
    }
}
