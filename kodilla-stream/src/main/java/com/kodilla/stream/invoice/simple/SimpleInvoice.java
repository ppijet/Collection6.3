package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.summingDouble;


public final class SimpleInvoice {

    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem Item){

        items.add(Item);
    }

    public boolean removeItem(SimpleItem Item){

        return items.remove(Item);
    }

    public double getValueToPay(){

        return items.stream()
                .collect(summingDouble(SimpleItem::getValue));
    }
}
