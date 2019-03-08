package com.kodilla.good.patterns.chellenges;

public class DrugStoreRepository implements ProductsRepository {

    public boolean createOrder(User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate) {
        System.out.println("The order has been created");
        return true;
    }

}
