package com.kodilla.good.patterns.chellenges;

public class DrugStoreSellingService implements SellingService{

    public boolean sell (User user, Order order, OrderDate orderDate, DeliveryDate deliveryDate){

        System.out.println("Order nr: " + order.getOrderNumber() +
                "\nSelling: " + order.getProduct() +
                "\nQuantity: " + order.getQuantity() +
                "\nPrice per item: " + order.getCurrency() + " " + order.getPrice() +
                "\nTo: " + user.getName() + " " + user.getSurname() +
                "\nOrder date: " + orderDate.getOrderDate() +
                "\nDelivery date: " + deliveryDate.getDeliveryDate());
        return true;
    }
}
