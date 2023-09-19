package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
@Table(name = "class_rooms")
public class ClassRoom {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private ClassRoomState state;

    @OneToOne(mappedBy = "classRoom")
    private Teacher teacher;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;


}