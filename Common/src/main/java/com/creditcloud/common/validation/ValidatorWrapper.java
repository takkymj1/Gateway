/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.validation;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

/**
 *
 * @author sobranie
 */
public class ValidatorWrapper implements Validator {
    
    private final Validator validator;
    
    public ValidatorWrapper (Validator validator) {
        this.validator = validator;
    }
    
    public <T> void tryValidate(T Object, Class<?>... groups) {
        Set<ConstraintViolation<T>> cv;
        try {
            cv = validator.validate(Object, groups);
        } catch (IllegalArgumentException | ValidationException ex) {
            throw ex;
        }
        if (cv != null && cv.size() > 0) {
            throw InvalidException.create(cv);
        }
    }
    
    public <T> void tryValidateProperty(T object, String propertyName, Class<?>... groups) {
        Set<ConstraintViolation<T>> cv;
        try {
            cv = validator.validateProperty(object, propertyName, groups);
        } catch (IllegalArgumentException | ValidationException ex) {
            throw ex;
        }
        if (cv != null && cv.size() > 0) {
            throw InvalidException.create(cv);
        }
    }
    
    public <T> void tryValidateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
        Set<ConstraintViolation<T>> cv;
        try {
            cv = validator.validateValue(beanType, propertyName, value, groups);
        } catch (IllegalArgumentException | ValidationException ex) {
            throw ex;
        }
        if (cv != null && cv.size() > 0) {
            throw InvalidException.create(cv);
        }
    }
    
    @Override
    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
        return validator.validate(object, groups);
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
        return validator.validateProperty(object, propertyName, groups);
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
        return validator.validateValue(beanType, propertyName, value, groups);
    }

    @Override
    public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
        return validator.getConstraintsForClass(clazz);
    }

    @Override
    public <T> T unwrap(Class<T> type) {
        return validator.unwrap(type);
    }

    @Override
    public ExecutableValidator forExecutables() {
        return validator.forExecutables();
    }
    
}
