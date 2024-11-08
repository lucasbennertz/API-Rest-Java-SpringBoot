package com.lucas.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.Rest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
