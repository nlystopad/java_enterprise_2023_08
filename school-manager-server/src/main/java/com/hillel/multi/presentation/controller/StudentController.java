package com.hillel.multi.presentation.controller;

import com.hillel.api.StudentManagerApi;
import com.hillel.model.Student;
import com.hillel.model.UpdateStudentByIdRequest;
import com.hillel.multi.inftastructure.exceptions.AlreadyExistException;
import com.hillel.multi.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
@RequestMapping("/api/v1")
public class StudentController implements StudentManagerApi {
    @Autowired
    private StudentServiceImpl studentService;

    @Override
    public ResponseEntity<Student> addStudent(
            @Valid @RequestBody Student student,
            @RequestHeader(value = "debug", required = false, defaultValue = "0") Integer debug) {
        if (student.getId() == 10L) { // don't have DB rn. so let's just imagine we already have entity with id 10
            throw new AlreadyExistException(String.format("Student with id %d already exists", student.getId()));
        }
        Student student1 = new Student(student.getId(), student.getName(), student.getAge(), student.getSchoolName());
        student1.setAverageMark(student.getAverageMark());
        student1.setTeachers(student.getTeachers());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(student1);

    }

    @Override
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        if (id == 25L) { // don't have DB rn so let's imagine
            throw new RuntimeException();
        }
        Student student = new Student();
        student.setId(id);
        return ResponseEntity.ok(student);

    }

    @Override
    public ResponseEntity<Student> updateStudentById(@Parameter(name = "id", description = "Student Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
                                                     @Parameter(name = "UpdateStudentByIdRequest", description = "", required = true) @Valid @RequestBody UpdateStudentByIdRequest updateStudentByIdRequest) {
        Student student = new Student();
        student.setId(id);
        student.setName(updateStudentByIdRequest.getStudentName());
        student.setAge(updateStudentByIdRequest.getAge());
        student.setSchoolName(updateStudentByIdRequest.getSchoolName());
        student.setAverageMark(updateStudentByIdRequest.getAverageMark());
        student.setTeachers(updateStudentByIdRequest.getTeachers());
        return ResponseEntity.ok(student);

    }

    @GetMapping("/students/school/{schoolId}")
    public ResponseEntity<List<Student>> getAllStudentsBySchoolId(@PathVariable Long schoolId) {
        return null;
    }

    @GetMapping("/students/teacher/{teacherId}")
    public ResponseEntity<List<Student>> getAllStudentsByTeacherId(@PathVariable Long teacherId) {
        return null;
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(String.format("Student with id %s was deleted successfully", id));
    }

    @PatchMapping("/student/{studentId}/school/{schoolId}")
    public ResponseEntity<Student> updateSchoolById(@PathVariable Long studentId,
                                                    @PathVariable Long schoolId) {
        return null;
    }

    @PatchMapping("/student/{studentId}/teacher/{teacherId}")
    public ResponseEntity<Student> updateTeacherById(@PathVariable Long studentId,
                                                     @PathVariable Long teacherId) {
        return null;
    }

}
