package com.hillel.multi.service;

import com.hillel.multi.inftastructure.exceptions.NotFoundException;
import com.hillel.multi.persistent.entity.School;
import com.hillel.multi.persistent.repository.SchoolRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


@Validated
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School getById(Long id) {
        return schoolRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public School getByName(String name) {
        return schoolRepository.findByName(name);
    }

    @Override
    public School updateById(Long id, School school) {
        schoolRepository.findById(id).orElseThrow(NotFoundException::new);
        return schoolRepository.save(school);
    }

    @Override
    public void deleteById(Long id) {
        schoolRepository.deleteById(id);
    }


    public void validateSchool(@Valid School school) {
        System.out.printf("School with id %s was validated", school.getId());
    }
}
