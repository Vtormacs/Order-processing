package com.educaweb.projeto.Service;

import com.educaweb.projeto.Entity.Order;
import com.educaweb.projeto.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = this.orderRepository.findById(id);
        return obj.get();
    }
}
