package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.SchoolEntity;

import java.util.List;

public interface SchoolService {
    SchoolEntity createSchool(SchoolEntity school); // http post

    SchoolEntity getById(Long id); // http get

    List<SchoolEntity> getByName(String name); // http get

    SchoolEntity updateById(Long id, SchoolEntity school); // http put

    void deleteById(Long id); // http delete

}
