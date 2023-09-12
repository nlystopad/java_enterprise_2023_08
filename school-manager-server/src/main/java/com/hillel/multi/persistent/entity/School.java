package com.hillel.multi.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class School {
    private Long id;
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<ClassRoom> classrooms;
    // todo: add more fields
}
