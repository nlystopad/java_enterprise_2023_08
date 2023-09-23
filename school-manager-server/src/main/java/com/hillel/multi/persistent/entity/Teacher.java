package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "teachers_students",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    @Enumerated(EnumType.STRING)
    private TeacherRole role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_room_id", referencedColumnName = "id")
    private ClassRoom classRoom;

}
