package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.TeacherEntity;
import com.hillel.multi.persistent.entity.TeacherRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    TeacherEntity addTeacher(TeacherEntity teacher); // post

    TeacherEntity getTeacherById(Long id); // get

    List<TeacherEntity> getAllByRole(TeacherRole role); // get

    List<TeacherEntity> getAllBySchoolId(Long schoolId); // get

    TeacherEntity updateById(Long id, TeacherEntity teacher); // put

    void deleteById(Long id); // delete

    TeacherEntity updateRoleById(Long teacherId, TeacherRole role); // patch

    TeacherEntity updateStudentById(Long teacherId, Long studentId); // connect Student entity and Teacher entity in Teacher table

    TeacherEntity updateClassRoomById(Long teacherId, Long classRoomId); // connect ClassRoom entity and Teacher entity in Teacher table

    TeacherEntity updateSchoolById(Long teacherId, Long schoolId); // connect School entity and Teacher entity in Teacher table

}
