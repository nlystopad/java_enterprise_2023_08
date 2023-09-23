package com.hillel.multi.persistent.entity;

import com.hillel.multi.service.validation.annotation.ValidSchoolAddress;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "schools")
@Validated
public class School {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    @ValidSchoolAddress(pattern = "\\d+, .+") // like "21, the something street"
    private String address;

    @OneToMany(mappedBy = "school")
    private List<Student> students;

    @OneToMany(mappedBy = "school")
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "school")
    private List<ClassRoom> classrooms;


}
