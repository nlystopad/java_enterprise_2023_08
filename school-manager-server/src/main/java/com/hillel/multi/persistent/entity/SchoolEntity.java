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
public class SchoolEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    @ValidSchoolAddress(pattern = "\\d+, .+") // like "21, the something street"
    private String address;

    @OneToMany(mappedBy = "school")
    private List<StudentEntity> students;

    @OneToMany(mappedBy = "school")
    private List<TeacherEntity> teachers;

    @OneToMany(mappedBy = "school")
    private List<ClassRoomEntity> classrooms;

}
