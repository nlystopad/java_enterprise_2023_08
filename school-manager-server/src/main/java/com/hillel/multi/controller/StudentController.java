package com.hillel.multi.controller;

import com.hillel.api.StudentManagerApi;
import com.hillel.model.Student;
import com.hillel.model.UpdateStudentByIdRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Validated
@RequestMapping("/api/v1")
public class StudentController implements StudentManagerApi {
    @Override
    public ResponseEntity<Student> addStudent(
            @Valid @RequestBody Student student,
            @RequestHeader(value = "debug", required = false, defaultValue = "0") Integer debug) {
        Student student1 = new Student(student.getId(), student.getName(), student.getAge(), student.getSchoolName());
        student1.setAverageMark(student.getAverageMark());
        student1.setTeachers(student.getTeachers());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(student1);

    }

    @Override
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        Student student = new Student();
        student.setId(id);
        return ResponseEntity.ok(student);

    }

    @Override
    public ResponseEntity<Student> updateStudentById(@NotNull @Valid @RequestParam(value = "id", required = true) Long id,
                                                     @Valid @RequestBody UpdateStudentByIdRequest updateStudentByIdRequest) {
        Student student = new Student();
        student.setId(id);
        student.setName(updateStudentByIdRequest.getStudentName());
        student.setAge(updateStudentByIdRequest.getAge());
        student.setSchoolName(updateStudentByIdRequest.getSchoolName());
        student.setAverageMark(updateStudentByIdRequest.getAverageMark());
        student.setTeachers(updateStudentByIdRequest.getTeachers());
        return ResponseEntity.ok(student);

    }
}
