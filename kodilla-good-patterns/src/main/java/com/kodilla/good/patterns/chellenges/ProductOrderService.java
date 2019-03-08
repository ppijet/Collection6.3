package com.kodilla.good.patterns.chellenges;

public class ProductOrderService {

    private InformationService informationService;
    private SellingService sellingService;
    private ProductsRepository productsRepository;

    public ProductOrderService(InformationService informationService, SellingService sellingService, ProductsRepository productsRepository) {
        this.informationService = informationService;
        this.sellingService = sellingService;
        this.productsRepository = productsRepository;
    }

    public SaleDto process(final SellRequest sellRequest) {
        boolean isSold = sellingService.sell(sellRequest.getUser(),sellRequest.getOrder(),
                sellRequest.getOrderDate(), sellRequest.getDeliveryDate());

        if(isSold) {
            informationService.inform(sellRequest.getUser());
            productsRepository.createOrder(sellRequest.getUser(), sellRequest.getOrder(),
                    sellRequest.getOrderDate(), sellRequest.getDeliveryDate());
            return new SaleDto(sellRequest.getUser(), true);
        }else{
            return new SaleDto(sellRequest.getUser(), false);
        }

    }
}
