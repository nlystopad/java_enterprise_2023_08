package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.TeacherEntity;
import com.hillel.multi.persistent.entity.TeacherRole;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1")
public class TeacherController {
//    @Autowired
//    private TeacherService teacherService;


    @PostMapping("/teacher")
    public ResponseEntity<TeacherEntity> addTeacher(@RequestBody TeacherEntity teacherEntity) {
        return null;
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<TeacherEntity> getTeacherById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/teacher")
    public ResponseEntity<List<TeacherEntity>> getAllTeachersByRole(@RequestParam TeacherRole role) {
        return null;
    }

    @PutMapping("/teacher/{id}")
    public ResponseEntity<TeacherEntity> updateById(@PathVariable Long id,
                                                    @RequestBody TeacherEntity teacherEntity) {
        return null;
    }

    @DeleteMapping("/teacher/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(String.format("Teacher with id %s was deleted successfully", id));
    }

    @PatchMapping("/teacher/{id}")
    public ResponseEntity<TeacherEntity> updateRoleById(@PathVariable Long id,
                                                        @RequestParam TeacherRole role) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/student/{studentId}")
    public ResponseEntity<TeacherEntity> updateStudentById(@PathVariable Long teacherId,
                                                           @PathVariable Long studentId) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/classroom/{classroomId}")
    public ResponseEntity<TeacherEntity> updateClassRoomById(@PathVariable Long teacherId,
                                                             @PathVariable Long classroomId) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/school/{schoolId}")
    public ResponseEntity<TeacherEntity> updateSchoolById(@PathVariable Long teacherId,
                                                          @PathVariable Long schoolId) {
        return null;
    }
}
