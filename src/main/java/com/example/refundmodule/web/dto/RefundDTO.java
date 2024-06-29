package com.example.refundmodule.web.dto;

import java.util.ArrayList;

public class RefundDTO {

    private long id;

    private int customerId;

    private ArrayList<RefundProductDTO> productsToRefund;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<RefundProductDTO> getProductsToRefund() {
        return productsToRefund;
    }

    public void setProductIds(ArrayList<RefundProductDTO> productsToRefund) {
        this.productsToRefund = productsToRefund;
    }
}
