package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.ClassRoomEntity;
import com.hillel.multi.persistent.entity.ClassRoomState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassRoomService {
    ClassRoomEntity createClassRoom(ClassRoomEntity room); // post

    ClassRoomEntity getById(Long id); // get

    List<ClassRoomEntity> getAllBySchoolId(Long schoolId); // get

    List<ClassRoomEntity> getAllByState(ClassRoomState state); // get

    ClassRoomEntity updateById(Long id, ClassRoomEntity room); // put

    void deleteById(Long id); // delete

    ClassRoomEntity updateTeacherById(Long classRoomId, Long teacherId); // connect Teacher entity and ClassRoom entity in ClassRoom table

    ClassRoomEntity updateSchoolById(Long classRoomId, Long schoolId); // connect School entity and ClassRoom entity in ClassRoom table
}
