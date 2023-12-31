package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);
    User findByToken(String token);
}
