package com.company.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PaymentController {

    @GetMapping("/payment")
    public Map<String, Object> getPayment() {

        return Map.of(
                "paymentId", 5001,
                "orderId", 1001,
                "amount", 75000,
                "method", "Credit Card",
                "status", "SUCCESS"
        );

    }

}
