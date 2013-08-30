/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.constraints.validator.IncrementalValidator;
import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * 用来限定最小/最大值且是按照一定数递增 如最小为100，且按照50递增的数
 *
 * @author rooseek
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IncrementalValidator.class})
public @interface IncrementalInteger {

    String message() default "{common.incrementalInteger.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * @return value the element must be larger or equal to
     */
    int min();
    
    /**
     * @return value the element must be smaller or equal to 
     */
    int max();

    /**
     * @return value must be incremental
     */
    int increment();

    /**
     * Defines several {@link IncrementalInteger} annotations on the same
     * element.
     *
     * @see IncrementalInteger
     */
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List {

        IncrementalInteger[] value();
    }
}
