package com.example.kodilla.patterns2.facade;

public class Item {
    private final Long productId;
    private final double qty;
    public Long getProductId;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() { return productId; }

    public double getQty() { return qty; }

}
