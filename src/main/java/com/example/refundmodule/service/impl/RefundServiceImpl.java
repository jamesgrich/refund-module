package com.example.refundmodule.service.impl;

import com.example.refundmodule.persistence.model.Refund;
import com.example.refundmodule.persistence.repository.RefundRepository;
import com.example.refundmodule.service.RefundService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RefundServiceImpl implements RefundService {

    private final RefundRepository refundRepository;

    public RefundServiceImpl(final RefundRepository refundRepository) {
        this.refundRepository = refundRepository;
    }

    @Override
    public Boolean validateRefundRequest(Refund refund) {
        // Check that the Customer ID matches the customer that initiated the refund
        // If it does, proceed, if not, return false

        // Check that the Order ID relates to the customer that initiated the refund
        // If it does, proceed, if not, return false

        // Check that the Product ID array (IE, products requiring a refund) has at least one item in it
        // If it does, proceed, if not, return false

        // Check that the order database to ensure order status is of type C.
        // If it does, proceed, if not, return false

        // Lastly, query the payments database to ensure that if the payment has been used before, it has not exceeded
        // the total balance. If it hasn't then return true, otherwise return false
        return true;
    }

    @Override
    public Refund save(Refund refund) {
        // TODO: mark refund as status R (Refunded) in the database
        return null;
    }
}
