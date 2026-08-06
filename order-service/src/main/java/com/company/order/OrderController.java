package com.company.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/order")
    public Map<String, Object> getOrder() {

        return Map.of(
                "orderId", 1001,
                "customer", "Bastin",
                "product", "Laptop",
                "quantity", 1,
                "status", "Created"
        );

    }

}
