package com.demoProject.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface OrderRepo extends JpaRepository<OrderItem,Long> {
}
