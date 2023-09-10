package com.hillel.multi.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Teacher {
    private Long id;
    private School school;
    private List<Student> students;
    private TeacherRole role;
    private ClassRoom classRoom;
    // todo: add more fields


}
