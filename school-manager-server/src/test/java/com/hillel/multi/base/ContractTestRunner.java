package com.hillel.multi.base;

import com.hillel.multi.presentation.controller.SchoolController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest(SchoolController.class)
public class ContractTestRunner {

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    public void setUp()  {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}

