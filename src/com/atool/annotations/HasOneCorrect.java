package com.atool.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = HasOneCorrectValidator.class)
public @interface HasOneCorrect {

	String message() default "{Must have at least one true}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
