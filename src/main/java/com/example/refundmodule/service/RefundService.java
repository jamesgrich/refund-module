package com.example.refundmodule.service;

import com.example.refundmodule.persistence.model.Refund;

import java.util.List;
import java.util.Optional;

public interface RefundService {

    Boolean validateRefundRequest(Refund refund);

    Refund save(Refund refund);
}