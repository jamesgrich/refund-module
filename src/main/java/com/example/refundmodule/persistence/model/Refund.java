package com.example.refundmodule.persistence.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

@Entity
public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private int customerId;

    @ElementCollection
    private ArrayList<String> productIds;

    public Refund(Long id, String name, ArrayList<String> productIds)
    {
        this.id = id;
        this.customerId = -1;
        this.productIds = productIds;
    }

    public Refund() {

    }
}
