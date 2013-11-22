/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

/**
 * 汇付日期格式:yyyyMMdd
 *
 * @author rooseek
 */
@Pattern(regexp = "([2][0][1-9][0-9][0-1][0-9][0-3][0-9])", message = "{common.PNRDate.Pattern}")
@Constraint(validatedBy = {})
@Target({ElementType.METHOD,
         ElementType.FIELD,
         ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PnRDate {

    String message() default "{common.PNRDate.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
