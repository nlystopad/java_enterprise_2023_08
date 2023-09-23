package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.School;
import com.hillel.multi.service.SchoolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/api/v1")
public class SchoolController {
    @Autowired
    private SchoolServiceImpl schoolService;

    @PostMapping("/school")
    public ResponseEntity<School> addSchool(@RequestBody School school) {
        return ResponseEntity.status(HttpStatus.CREATED).body(schoolService.createSchool(school));
    }

    @GetMapping("/school/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Long id) {
        return ResponseEntity.ok(schoolService.getById(id));
    }

    @GetMapping("/school")
    public ResponseEntity<School> getSchoolByName(@RequestParam String name) {
        return ResponseEntity.ok(schoolService.getByName(name));
    }


    @PutMapping("/school/{id}")
    public ResponseEntity<School> updateSchoolById(@PathVariable Long id,
                                                   @RequestBody School school) {
        return ResponseEntity.ok(schoolService.updateById(id, school));
    }


    @DeleteMapping("/school/{id}")
    public ResponseEntity<String> deleteSchoolById(@PathVariable Long id) {
        schoolService.deleteById(id);
        return ResponseEntity.ok(String.format("School with id %s was deleted successfully", id));
    }
}
