package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.School;
import org.springframework.stereotype.Service;

public interface SchoolService {
    School createSchool(School school); // http post

    School getById(Long id); // http get

    School getByName(String name); // http get

    School updateById(Long id, School school); // http put

    void deleteById(Long id); // http delete

}
