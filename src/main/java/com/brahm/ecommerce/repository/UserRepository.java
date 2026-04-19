package com.brahm.ecommerce.repository;

import com.brahm.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.brahm.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}