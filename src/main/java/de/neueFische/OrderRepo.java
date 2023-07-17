package de.neueFische;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderRepo {

    HashMap<Integer, Order> orders = new HashMap<>();


    public OrderRepo (){

    }

    public void addOrder(Order order){
        orders.put(order.getId(), order);
    }
    public HashMap<Integer, Order> getAllOrders(){
        return this.orders;
    }

    public Order getOrderById(int id){
        return this.orders.get(id);
    }


}
