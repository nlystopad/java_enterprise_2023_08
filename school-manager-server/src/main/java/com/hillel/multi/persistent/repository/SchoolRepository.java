package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface SchoolRepository extends JpaRepository<School, Long> {

    School findByName(String name);
}
