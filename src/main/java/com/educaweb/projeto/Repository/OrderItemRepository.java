package com.educaweb.projeto.Repository;

import com.educaweb.projeto.Entity.OrderItem;
import com.educaweb.projeto.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
