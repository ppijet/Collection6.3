package com.kodilla.good.patterns.chellenges;

public class Order {

    int orderNumber;
    String product;
    int quantity;
    double price;
    String currency;

    public Order(final int orderNumber, final String product,
                 final int quantity, final double price,
                 final String currency) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.currency = currency;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
