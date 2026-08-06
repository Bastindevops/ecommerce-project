package com.company.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String, Object> getUser() {

        return Map.of(
                "userId", 101,
                "name", "Bastin",
                "email", "bastin@example.com",
                "city", "Chennai",
                "role", "Customer"
        );

    }

}
