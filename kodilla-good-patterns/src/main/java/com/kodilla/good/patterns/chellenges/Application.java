package com.kodilla.good.patterns.chellenges;

public class Application {

    public static void main(String[] args) {

        SellRequestForm sellRequestRetriever = new SellRequestForm();
        SellRequest sellRequest = sellRequestRetriever.form();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(),
                new DrugStoreSellingService(),
                new DrugStoreRepository());
        productOrderService.process(sellRequest);

    }
}
