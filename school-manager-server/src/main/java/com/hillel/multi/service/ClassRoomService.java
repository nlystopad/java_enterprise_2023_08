package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.ClassRoom;
import com.hillel.multi.persistent.entity.ClassRoomState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassRoomService {
    ClassRoom createClassRoom(ClassRoom room); // post

    ClassRoom getById(Long id); // get

    List<ClassRoom> getAllBySchoolId(Long schoolId); // get

    List<ClassRoom> getAllByState(ClassRoomState state); // get

    ClassRoom updateById(Long id, ClassRoom room); // put

    void deleteById(Long id); // delete

    ClassRoom updateTeacherById(Long classRoomId, Long teacherId); // connect Teacher entity and ClassRoom entity in ClassRoom table

    ClassRoom updateSchoolById(Long classRoomId, Long schoolId); // connect School entity and ClassRoom entity in ClassRoom table
}
