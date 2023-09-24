package com.hillel.multi.service.mapper;

import com.hillel.model.School;
import com.hillel.multi.persistent.entity.SchoolEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SchoolMapper {

    SchoolMapper INSTANCE = Mappers.getMapper(SchoolMapper.class);


    School SchoolToSchoolDto(SchoolEntity entity);

    @Mapping(target = "students", ignore = true)
    @Mapping(target = "teachers", ignore = true)
    @Mapping(target = "classrooms", ignore = true)
    SchoolEntity SchoolDtoToSchool(School dto);
}
