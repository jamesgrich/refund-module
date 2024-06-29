package com.example.refundmodule.web.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class RefundProductDTO {

    @NotNull
    private int quantity;

    @NotNull
    private int amount;

    @NotNull
    private int paymentReferenceId;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(@NotNull int amount) {
        this.amount = amount;
    }

    public int getPaymentReferenceId() {
        return paymentReferenceId;
    }

    public void setPaymentReferenceId(int paymentReferenceId) {
        this.paymentReferenceId = paymentReferenceId;
    }

}
