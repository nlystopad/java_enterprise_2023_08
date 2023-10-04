package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
