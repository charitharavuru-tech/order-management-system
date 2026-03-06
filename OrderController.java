package com.example.ordermanagement;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private Map<Integer, String> orders = new HashMap<>();

    @PostMapping
    public String createOrder(@RequestParam int id, @RequestParam String item) {
        orders.put(id, item);
        return "Order created successfully";
    }

    @GetMapping
    public Map<Integer, String> getOrders() {
        return orders;
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {
        orders.remove(id);
        return "Order deleted";
    }
}
