package com.kodilla.good.patterns.chellenges;

public class SellRequest {

    User user;
    Order order;
    OrderDate orderDate;
    DeliveryDate deliveryDate;

    public SellRequest(User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate) {
        this.user = user;
        this.order = order;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public OrderDate getOrderDate() {
        return orderDate;
    }

    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }
}
