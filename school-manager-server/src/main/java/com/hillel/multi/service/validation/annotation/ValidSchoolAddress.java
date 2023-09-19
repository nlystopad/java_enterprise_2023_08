package com.hillel.multi.service.validation.annotation;


import jakarta.validation.Constraint;
import jakarta.validation.ConstraintTarget;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = {SchoolAddressValidator.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSchoolAddress {

    String message() default "Invalid school address";

    String pattern() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    ConstraintTarget validationAppliesTo() default ConstraintTarget.IMPLICIT;
}


