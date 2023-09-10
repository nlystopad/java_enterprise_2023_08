package com.hillel.multi.controller;

import com.hillel.multi.persistent.entity.School;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/api/v1")
public class SchoolController {
    //    @Autowired
    //    private SchoolService schoolService;

    @PostMapping("/school")
    public ResponseEntity<School> addSchool(@RequestBody School school) {
        return null;
    }

    @GetMapping("/school/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/school/{name}")
    public ResponseEntity<School> getSchoolByName(@PathVariable String name) {
        return null;
    }


    @PutMapping("/school/{id}")
    public ResponseEntity<School> updateSchoolById(@PathVariable Long id,
                                                   @RequestBody School school) {
        return null;
    }


    @DeleteMapping("/school/{id}")
    public ResponseEntity<String> deleteSchoolById(@PathVariable Long id) {
        return ResponseEntity.ok(String.format("School with id %s was deleted successfully", id));
    }
}
