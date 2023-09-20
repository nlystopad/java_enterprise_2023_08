package com.hillel.multi.service.validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import jakarta.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget({ValidationTarget.PARAMETERS, ValidationTarget.ANNOTATED_ELEMENT})
public class SchoolAddressValidator implements ConstraintValidator<ValidSchoolAddress, String> {

    private String pattern;
    private Class<? extends Payload>[] payload;

    @Override
    public void initialize(ValidSchoolAddress constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        payload = constraintAnnotation.payload();
        pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String address, ConstraintValidatorContext constraintValidatorContext) {
        return address != null && address.matches(pattern)
                && address.length() >= 5;
    }
}
