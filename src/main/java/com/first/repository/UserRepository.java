package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.first.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
