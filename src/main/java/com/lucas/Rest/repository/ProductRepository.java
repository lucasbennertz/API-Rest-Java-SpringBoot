package com.lucas.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.Rest.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
