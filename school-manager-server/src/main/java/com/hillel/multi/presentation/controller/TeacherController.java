package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Teacher;
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
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        return null;
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/teacher")
    public ResponseEntity<List<Teacher>> getAllTeachersByRole(@RequestParam TeacherRole role) {
        return null;
    }

    @PutMapping("/teacher/{id}")
    public ResponseEntity<Teacher> updateById(@PathVariable Long id,
                                              @RequestBody Teacher teacher) {
        return null;
    }

    @DeleteMapping("/teacher/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(String.format("Teacher with id %s was deleted successfully", id));
    }

    @PatchMapping("/teacher/{id}")
    public ResponseEntity<Teacher> updateRoleById(@PathVariable Long id,
                                                  @RequestParam TeacherRole role) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/student/{studentId}")
    public ResponseEntity<Teacher> updateStudentById(@PathVariable Long teacherId,
                                                     @PathVariable Long studentId) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/classroom/{classroomId}")
    public ResponseEntity<Teacher> updateClassRoomById(@PathVariable Long teacherId,
                                                       @PathVariable Long classroomId) {
        return null;
    }

    @PatchMapping("/teacher/{teacherId}/school/{schoolId}")
    public ResponseEntity<Teacher> updateSchoolById(@PathVariable Long teacherId,
                                                    @PathVariable Long schoolId) {
        return null;
    }
}
