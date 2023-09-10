package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Teacher;
import com.hillel.multi.persistent.entity.TeacherRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    Teacher addTeacher(Teacher teacher); // post

    Teacher getTeacherById(Long id); // get

    List<Teacher> getAllByRole(TeacherRole role); // get

    List<Teacher> getAllBySchoolId(Long schoolId); // get

    Teacher updateById(Long id, Teacher teacher); // put

    void deleteById(Long id); // delete

    Teacher updateRoleById(Long teacherId, TeacherRole role); // patch

    Teacher updateStudentById(Long teacherId, Long studentId); // connect Student entity and Teacher entity in Teacher table

    Teacher updateClassRoomById(Long teacherId, Long classRoomId); // connect ClassRoom entity and Teacher entity in Teacher table

    Teacher updateSchoolById(Long teacherId, Long schoolId); // connect School entity and Teacher entity in Teacher table

}
