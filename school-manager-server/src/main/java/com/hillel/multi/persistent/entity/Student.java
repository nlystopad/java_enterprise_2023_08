package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Double age;

    @Column(name = "average_mark")
    private Double averageMark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToMany(mappedBy = "students")
    private List<Teacher> teachers;

}
