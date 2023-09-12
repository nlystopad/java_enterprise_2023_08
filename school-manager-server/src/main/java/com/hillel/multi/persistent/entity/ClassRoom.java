package com.hillel.multi.persistent.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassRoom {
    private Long id;
    private ClassRoomState state;
    private Teacher teacher;
    private School school;
    // todo: add more fields
}
