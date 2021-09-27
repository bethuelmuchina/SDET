package com.store.service;

import java.math.BigDecimal;
import java.util.List;

import com.store.model.Order;
import com.store.model.Product;

public interface OrderService {
    Order createOrder(List<Product> shoppingCart, BigDecimal total);

    List<Order> findall();
}
