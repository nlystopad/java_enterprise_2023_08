package com.hillel.multi.presentation.controller;

import com.hillel.api.SchoolManagerApi;
import com.hillel.model.School;
import com.hillel.multi.persistent.entity.SchoolEntity;
import com.hillel.multi.service.SchoolServiceImpl;
import com.hillel.multi.service.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1")
public class SchoolController implements SchoolManagerApi {
    @Autowired
    private SchoolServiceImpl schoolService;

    @Override
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        SchoolEntity entity = SchoolMapper.INSTANCE.SchoolDtoToSchool(school);
        SchoolEntity created = schoolService.createSchool(entity);
        School toReturn = SchoolMapper.INSTANCE.SchoolToSchoolDto(created);
        return ResponseEntity.status(HttpStatus.CREATED).body(toReturn);
    }

    @Override
    public ResponseEntity<School> getSchoolById(@PathVariable Long id) {
        SchoolEntity byId = schoolService.getById(id);
        School toReturn = SchoolMapper.INSTANCE.SchoolToSchoolDto(byId);
        return ResponseEntity.ok(toReturn);
    }

    @Override
    public ResponseEntity<List<School>> getSchoolByName(@RequestParam String name) {
        List<SchoolEntity> byName = schoolService.getByName(name);
        List<School> toReturn = new ArrayList<>();
        for (SchoolEntity entity : byName) {
            toReturn.add(SchoolMapper.INSTANCE.SchoolToSchoolDto(entity));
        }
        return ResponseEntity.ok(toReturn);
    }


    @Override
    public ResponseEntity<School> updateSchoolById(@PathVariable Long id,
                                                   @RequestBody School school) {
        SchoolEntity toUpdate = SchoolMapper.INSTANCE.SchoolDtoToSchool(school);
        SchoolEntity updated = schoolService.updateById(id, toUpdate);
        School toReturn = SchoolMapper.INSTANCE.SchoolToSchoolDto(updated);
        return ResponseEntity.ok(toReturn);
    }


    @Override
    public ResponseEntity<String> deleteSchoolById(@PathVariable Long id) {
        schoolService.deleteById(id);
        return ResponseEntity.ok(String.format("School with id %s was deleted successfully", id));
    }
}
