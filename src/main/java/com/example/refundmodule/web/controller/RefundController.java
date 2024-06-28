package com.example.refundmodule.web.controller;

import com.example.refundmodule.service.RefundService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/refund")
public class RefundController {


    private final RefundService refundService;

    public RefundController(RefundService refundService)
    {
        this.refundService = refundService;
    }

    @PostMapping(path = "/refund/{reference_id}")
    public ResponseEntity initiateRefund(@PathVariable @RequestBody
                                             int customerId,
                                             int orderId,
                                             ArrayList<String> products)
    {
        // call the validateRefundRequest method in the service layer
        // if the method returns true, proceed, if not throw a HTTP bad request with the message "Refund not allowed"

        // call the payments provider API and initiate the refund
        // if the response returned is a success, then return a 200, otherwise throw a bad request
        // with the message "Refund could not be processed"

        // call the save method in the service layer
        // return HTTP OK if there was no bad requests above, like the below
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
