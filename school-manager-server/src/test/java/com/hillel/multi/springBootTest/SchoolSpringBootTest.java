package com.hillel.multi.springBootTest;

import com.hillel.multi.persistent.entity.School;
import com.hillel.multi.service.SchoolServiceImpl;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest(classes = SchoolSpringBootTest.class)
@ComponentScan("com.hillel.multi")
public class SchoolSpringBootTest {

//    @Container
    private static final PostgreSQLContainer POSTGRES_CONTAINER = new PostgreSQLContainer("postgres:16.0")
            .withDatabaseName("school")
            .withUsername("postgres")
            .withPassword("1");
    @Autowired
    SchoolServiceImpl schoolService;

    private static Flyway flyway;

    @BeforeAll
    static void beforeAll() {
        POSTGRES_CONTAINER.start();
        String url = POSTGRES_CONTAINER.getJdbcUrl();
        String username = POSTGRES_CONTAINER.getUsername();
        String password = POSTGRES_CONTAINER.getPassword();
        System.setProperty("spring.datasource.url", url);
        System.setProperty("spring.datasource.username", username);
        System.setProperty("spring.datasource.password", password);

        ClassicConfiguration classicConfiguration = new ClassicConfiguration();
        classicConfiguration.setUrl(url);
        classicConfiguration.setUser(username);
        classicConfiguration.setPassword(password);
        flyway = new Flyway(classicConfiguration);
    }

    @Test
    public void testSchool() {
        flyway.validate();
        School school = new School();
        school.setAddress("12, something street");

        schoolService.validateSchool(school);

    }
}
