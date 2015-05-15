/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.validator;

import com.creditcloud.model.constraints.IncrementalInteger;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
/**
 *
 * @author rooseek
 */
public class IncrementalValidator implements ConstraintValidator<IncrementalInteger, Integer> {

    private IncrementalInteger constraintAnnotation;

    @Inject
    Logger Logger;
    
    @Override
    public void initialize(IncrementalInteger constraintAnnotation) {
        this.constraintAnnotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        int min = constraintAnnotation.min();
        int increment = constraintAnnotation.increment();
        int max = constraintAnnotation.max();
        Logger.info("######## valid error, \n constraint={}, \n value={}", constraintAnnotation, value);
        if (value < min) {
            return false;
        }

        if (value > max) {
            return false;
        }

        if ((value - min) % increment != 0) {
            return false;
        }

        return true;
    }
}
