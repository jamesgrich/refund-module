package com.example.refundmodule.service;

import com.example.refundmodule.persistence.model.Refund;
import com.example.refundmodule.web.dto.RefundProductDTO;

import java.util.List;
import java.util.Optional;

public interface RefundService {

    Boolean validateRefundRequest(Refund refund);

    Refund save(Refund refund);

    void createRefund(Integer orderId, RefundProductDTO refundProductDTO);
}