/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * @author rooseek
 */
@Pattern(regexp = "([\\da-z]+)\\.([a-z\\.]{2,6})([\\w]\\.*)*", message = "{common.url.Pattern}")
@Constraint(validatedBy = {})
@NotNull(message = "{common.url.NotNull}")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Url {

    String message() default "{common.url.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
