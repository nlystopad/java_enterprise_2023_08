package com.hillel.multi.service;

import com.hillel.model.Student;
import com.hillel.multi.persistent.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public Student addStudent(StudentEntity student) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudentsBySchoolId(Long schoolId) {
        return null;
    }

    @Override
    public List<Student> getAllStudentsByTeacherId(Long teacherId) {
        return null;
    }

    @Override
    public Student updateStudentById(Long studentId, StudentEntity student) {
        return null;
    }

    @Override
    public void deleteStudentById(Long studentId) {

    }

    @Override
    public Student updateSchoolById(Long studentId, Long schoolId) {
        return null;
    }

    @Override
    public Student updateTeacherById(Long studentId, Long teacherId) {
        return null;
    }
}
