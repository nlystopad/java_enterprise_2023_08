package com.hillel.multi.base;

import com.hillel.multi.service.StudentService;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hillel.multi")
public class StudentPositiveBase extends ContractTestRunner{

    @MockBean
    private StudentService studentService;
}
