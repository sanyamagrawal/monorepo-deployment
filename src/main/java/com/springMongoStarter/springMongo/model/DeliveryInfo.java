package com.springMongoStarter.springMongo.model;

import java.util.Date;

public class DeliveryInfo {
    private Date deliveryDate;
    private Integer deliveryFee;

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Integer getDeliveryFee() {
        return deliveryFee;
    }

    public boolean isInStock() {
        return inStock;
    }

    public DeliveryInfo(Date deliveryDate, Integer deliveryFee, boolean inStock) {
        this.deliveryDate = deliveryDate;
        this.deliveryFee = deliveryFee;
        this.inStock = inStock;
    }

    private boolean inStock;
}

