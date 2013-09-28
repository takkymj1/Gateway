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
 * UUID used for CreditCloud in the format of
 * "9C490879-D40B-434F-B05C-D20F6990CF41"
 *
 * @UuidGenerator(name = "UUID_GEN")
 * @Id
 * @GeneratedValue(generator = "UUID_GEN")
 * @Column(name = "ID", length = 36);
 *
 * @author rooseek
 */
@Pattern(regexp = "[A-Z0-9]{8}-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{12}", message = "{common.uuid.Pattern}")
@Constraint(validatedBy = {})
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UUID {

    String message() default "{common.url.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
