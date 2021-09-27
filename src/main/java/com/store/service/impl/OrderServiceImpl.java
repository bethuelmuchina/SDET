package com.store.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.store.model.Order;
import com.store.model.Product;
import com.store.repository.OrderRepository;
import com.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(List<Product> shoppingCart, BigDecimal total) {
        Order order = new Order();
        order.setOrderDate(LocalDate.now());
        order.setShippingDate(LocalDate.now().plusDays(2));
        order.setCartItemList(shoppingCart);
        order.setShippingAddress("test");
        order.setOrderTotal(total);
        orderRepository.save(order);
        return order;
    }

    public List<Order> findall() {
        return orderRepository.findAll();
    }

}
