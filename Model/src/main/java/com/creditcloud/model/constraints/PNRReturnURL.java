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
 * 汇付RetUrl和BgRetUrl不能包含保留字符串和中文<p>
 *
 * @author rooseek
 */
@Pattern(regexp = "^((?![\u4E00-\u9FBF]|recv|rbsmag|cashmag|cash|ubs|acctmag|buser|busermag|mtp|mtpmag|muser|musermag|ubsmag|mag).)*$", message = "{common.PNRReturnURL.Pattern}")
@Constraint(validatedBy = {})
@Target({ElementType.METHOD,
         ElementType.FIELD,
         ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PNRReturnURL {

    String message() default "{common.PNRReturnURL.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
