package com.example.refundmodule.web.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

@Entity
public class RefundDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private int customerId;

    @ElementCollection
    private ArrayList<String> productIds;

    public RefundDTO(Long id, String name, ArrayList<String> productIds)
    {
        this.id = id;
        this.customerId = -1;
        this.productIds = productIds;
    }

    public RefundDTO() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(ArrayList<String> productIds) {
        this.productIds = productIds;
    }
}
