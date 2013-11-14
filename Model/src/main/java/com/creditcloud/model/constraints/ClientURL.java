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
 * 商户域名<p>
 * 必须是顶级域名 如www.creditcloud.com<p>
 * 不能带路径，如www.creditcloud.com/hello<p>
 * 不能带前缀，如http://www.creditcloud.com<p>
 *
 * @author rooseek
 */
@Pattern(regexp = "([\\da-zA-Z]+)\\.([a-zA-Z\\.]{2,6})([\\w]\\.*)*", message = "{common.url.Pattern}")
@Constraint(validatedBy = {})
@NotNull(message = "{common.url.NotNull}")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClientURL {

    String message() default "{common.url.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
