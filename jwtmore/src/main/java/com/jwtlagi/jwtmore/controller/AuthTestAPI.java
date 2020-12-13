package com.jwtlagi.jwtmore.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthTestAPI {


    @GetMapping("/api/test/user")
    @PreAuthorize("hasRole('SELLER') or hasRole('BUYER')")
    public String userAccess() {
        return ">>> User Contents!";
    }

    @GetMapping("/api/test/seller")
    @PreAuthorize("hasRole('SELLER') or hasRole('ADMIN')")
    public String sellerAccess() {
        return ">>> Seller Board";
    }

    @GetMapping("/api/test/buyer")
    @PreAuthorize("hasRole('BUYER') or hasRole('ADMIN')")
    public String buyerAccess() {
        return ">>> Buyer Board";
    }

    @GetMapping("/api/test/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return ">>> Admin Contents";
    }


}
