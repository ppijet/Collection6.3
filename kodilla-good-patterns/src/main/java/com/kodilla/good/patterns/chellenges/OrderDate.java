package com.kodilla.good.patterns.chellenges;

import java.time.LocalDate;

public class OrderDate {

    LocalDate orderDate;

    public OrderDate(int year, int month, int day){
        this.orderDate = LocalDate.of(year, month, day);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
