package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.School;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class SchoolServiceImpl implements SchoolService{
    @Override
    public School createSchool(School school) {
        return null;
    }

    @Override
    public School getById(Long id) {
        return null;
    }

    @Override
    public School getByName(String name) {
        return null;
    }

    @Override
    public School updateById(Long id, School school) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }


    public void validateSchool(@Valid School school) {
        System.out.printf("School with id %s was validated", school.getId());

    }
}
