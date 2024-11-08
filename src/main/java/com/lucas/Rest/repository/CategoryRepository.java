package com.lucas.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lucas.Rest.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
