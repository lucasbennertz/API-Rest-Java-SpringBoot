package com.lucas.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.Rest.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
