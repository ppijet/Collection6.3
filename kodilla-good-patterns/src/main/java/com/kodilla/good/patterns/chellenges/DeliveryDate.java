package com.kodilla.good.patterns.chellenges;

import java.time.LocalDate;

public class DeliveryDate {

    LocalDate deliveryDate;

    public DeliveryDate(int year, int month, int day) {
        this.deliveryDate = LocalDate.of(year, month, day);
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
