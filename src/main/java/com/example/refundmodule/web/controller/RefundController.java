package com.example.refundmodule.web.controller;

import com.example.refundmodule.service.RefundService;
import com.example.refundmodule.web.dto.RefundDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RefundController {

    private final RefundService refundService;

    public RefundController(RefundService refundService) {
        this.refundService = refundService;
    }

    //
    @PostMapping(path = "/refund")
    public ResponseEntity initiateRefund(@PathVariable int orderId, @Valid @RequestBody RefundDTO refundDTO) {
        // Call the validateRefundRequest method in the service layer
        // If the method returns true, proceed, if not throw a HTTP bad request with the message "Refund not allowed"

        // Call the payments provider API and initiate the refund, using the createRefund method in refundService

        // If the response from the payment provider returned is a success, then return a 200, otherwise throw a
        // bad request with the message "Refund could not be processed"

        // Call the save method in the service layer
        // Return HTTP OK if there was no bad requests above, like the below
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
