package com.hillel.multi.persistent.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private School school;
    private List<Teacher> teachers;
    // todo: add more fields
}
