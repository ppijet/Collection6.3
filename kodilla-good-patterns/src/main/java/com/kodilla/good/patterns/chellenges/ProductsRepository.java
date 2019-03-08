package com.kodilla.good.patterns.chellenges;

public interface ProductsRepository {

    boolean createOrder(User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate);
}
