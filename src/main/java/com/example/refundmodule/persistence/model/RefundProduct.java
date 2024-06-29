package com.example.refundmodule.persistence.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

@Entity
public class RefundProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private int amount;

    @NotNull
    private int quantity;

    @NotNull
    private int paymentReferenceId;

}