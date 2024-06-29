package com.example.refundmodule.service.impl;

import com.example.refundmodule.persistence.model.Refund;
import com.example.refundmodule.persistence.repository.RefundRepository;
import com.example.refundmodule.service.RefundService;
import com.example.refundmodule.web.dto.RefundProductDTO;
import org.springframework.stereotype.Service;

@Service
public class RefundServiceImpl implements RefundService {

    private static final double SHIPPING_FEE = 3.99;

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
        // Mark refund as status R (Refunded) in the database
        return null;
    }

    @Override
    public void createRefund(Integer orderId, RefundProductDTO refundProductDTO) {

        // Get the refunds that exist
        // Query the payment provider using the payment reference
        // Add the shipping fee using the constant at class level, as this would be the same fee across all orders
        // Assert the response is of type 200 - OK
        // Else return 400 - with the message "Payment could not be refunded";
    }

}
