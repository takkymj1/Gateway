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
import javax.validation.constraints.Size;

/**
 * Validation constraints for loginName
 * 限制登录名不能为手机号或者邮箱地址
 *
 * @author sobranie
 */
@Pattern(regexp = "^(?!(([1][3|5|8][0-9]{9})|([\\\\w-]+(\\\\.[\\\\w-]+)*@[\\\\w-]+(\\\\.[\\\\w-]+)+)))([0-9a-zA-Z_\u4E00-\u9FBF]+)", message = "{common.loginName.Pattern}")
@NotNull(message = "{common.loginName.NotNull}")
@Size(min = 2, max = 30, message = "{common.loginName.Size}")
@Constraint(validatedBy = {})
@Target({ElementType.METHOD,
         ElementType.FIELD,
         ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginName {

    String message() default "{common.loginName}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
