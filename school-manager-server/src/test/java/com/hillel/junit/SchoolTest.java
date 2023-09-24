package com.hillel.junit;

import com.hillel.multi.persistent.entity.SchoolEntity;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class SchoolTest {

    @Test
    public void testSchoolAddressConstraint() {
        SchoolEntity school1 = new SchoolEntity();
        school1.setAddress("address");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<SchoolEntity>> validate = validator.validate(school1);

        System.out.println(validate);

    }
}
