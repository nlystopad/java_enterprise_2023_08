package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "class_rooms")
public class ClassRoomEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Integer number;

    @Enumerated(EnumType.STRING)
    private ClassRoomState state;

    @OneToOne(mappedBy = "classRoom")
    private TeacherEntity teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private SchoolEntity school;


}