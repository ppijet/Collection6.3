package com.kodilla.stream.invoice.simple;

public final class SimpleItem {

        private final SimpleProduct product;
        private final double quantity;

        public SimpleItem(final SimpleProduct product, final double quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public SimpleProduct getProduct() {
            return product;
        }

        public double getQuanity() {
            return quantity;
        }
        public double getValue() {
            return product.getProductPrice() * quantity;
        }
}
