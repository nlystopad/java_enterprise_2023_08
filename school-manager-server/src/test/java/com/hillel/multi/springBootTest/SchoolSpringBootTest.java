package com.hillel.multi.springBootTest;

import com.hillel.multi.persistent.entity.School;
import com.hillel.multi.service.SchoolServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SchoolSpringBootTest {

    @Autowired
    SchoolServiceImpl schoolService;

    @Test
    public void testSchool() {
        School school = new School();
        school.setAddress("some random address");

        schoolService.validateSchool(school);

    }
}
