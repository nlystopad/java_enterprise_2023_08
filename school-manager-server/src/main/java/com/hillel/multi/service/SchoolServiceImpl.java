package com.hillel.multi.service;

import com.hillel.multi.inftastructure.exceptions.NotFoundException;
import com.hillel.multi.persistent.entity.SchoolEntity;
import com.hillel.multi.persistent.repository.SchoolRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Validated
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public SchoolEntity createSchool(SchoolEntity school) {
        return schoolRepository.save(school);
    }

    @Override
    public SchoolEntity getById(Long id) {
        return schoolRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<SchoolEntity> getByName(String name) {
        return schoolRepository.findByName(name);
    }

    @Override
    public SchoolEntity updateById(Long id, SchoolEntity school) {
        schoolRepository.findById(id).orElseThrow(NotFoundException::new);
        return schoolRepository.save(school);
    }

    @Override
    public void deleteById(Long id) {
        schoolRepository.deleteById(id);
    }

    public void validateSchool(@Valid SchoolEntity school) {
        System.out.printf("School with id %d was validated", school.getId());
    }
}
