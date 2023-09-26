package com.hillel.multi.persistent.repository;

import com.hillel.multi.persistent.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SchoolRepository extends JpaRepository<SchoolEntity, Long> {

    List<SchoolEntity> findByName(String name);


}
