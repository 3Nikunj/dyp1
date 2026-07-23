package com.dyp.dyp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dyp.dyp1.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
