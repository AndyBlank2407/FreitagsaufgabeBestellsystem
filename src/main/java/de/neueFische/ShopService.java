package de.neueFische;

import java.util.ArrayList;
import java.util.HashMap;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();
    //private static int orderIdCount = 1;

    public ShopService(){

    }

    public Product getProductById(int id){
        return this.productRepo.getProductById(id);
    }

    public ArrayList<Product> listProducts(){
        return this.productRepo.getAllProducts();
    }

    public void makeOrder(ArrayList<Product> productsToOrder){
       Order order = new Order(productsToOrder);
        orderRepo.addOrder(order);

    }
}
