package com.hillel.multi.service;

import com.hillel.model.Student;
import com.hillel.multi.persistent.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    Student addStudent(StudentEntity student); // post

    Student getStudentById(Long id); //get

    List<Student> getAllStudentsBySchoolId(Long schoolId); // get

    List<Student> getAllStudentsByTeacherId(Long teacherId); // get

    Student updateStudentById(Long studentId, StudentEntity student); // put

    void deleteStudentById(Long studentId); // delete

    Student updateSchoolById(Long studentId, Long schoolId);  // connect School entity and Student entity in Student table

    Student updateTeacherById(Long studentId, Long teacherId);  // connect Teacher entity and Student entity in Student table
}
