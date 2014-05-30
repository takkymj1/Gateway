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
import javax.validation.constraints.Pattern;

/**
 *
 * @author sobranie
 */
@Pattern(regexp = "[\u4E00-\u9FBF]{2,15}", message = "{common.realName.Pattern}")
//@NotNull(message = "{common.realName.NotNull}")
@Constraint(validatedBy = {})
@Target({ElementType.METHOD,
         ElementType.FIELD,
         ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RealName {

    String message() default "{common.realName}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
