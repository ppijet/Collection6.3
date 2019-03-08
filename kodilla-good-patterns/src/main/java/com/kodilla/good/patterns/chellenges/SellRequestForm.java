package com.kodilla.good.patterns.chellenges;

public class SellRequestForm {

    public SellRequest form() {

        User user = new User("Adam", "Nowak");
        Order order = new Order(1, "Shower gel 8x4", 5, 1.80, "EUR");
        OrderDate orderDate = new OrderDate(2019, 3, 1);
        DeliveryDate deliveryDate = new DeliveryDate(2019, 3, 4);

        return new SellRequest(user, order, orderDate, deliveryDate);

    }
}
