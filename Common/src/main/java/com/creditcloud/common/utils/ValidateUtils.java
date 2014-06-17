/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.common.rest.ValidationResult;
import com.creditcloud.common.validation.InvalidException;
import com.creditcloud.common.validation.ValidatorWrapper;

/**
 *
 * @author rooseek
 */
public class ValidateUtils {

    /**
     * validate for values in class
     *
     * @param validator
     * @param clazz
     * @param fieldName
     * @param value
     * @return
     */
    public static ValidationResult validate(ValidatorWrapper validator, Class clazz, String fieldName, String value) {
        ValidationResult result = new ValidationResult(value);
        try {
            validator.tryValidateValue(clazz, fieldName, value);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
    }

    /**
     * validate name
     *
     * @param validator
     * @param clazz
     * @param name
     * @return
     */
    public static ValidationResult validateName(ValidatorWrapper validator, Class clazz, String name) {
        return validate(validator, clazz, "name", name);
    }

    /**
     * validate mobile
     *
     * @param validator
     * @param clazz
     * @param mobile
     * @return
     */
    public static ValidationResult validateMobile(ValidatorWrapper validator, Class clazz, String mobile) {
        return validate(validator, clazz, "mobile", mobile);
    }

    /**
     * validate idNumber
     *
     * @param validator
     * @param clazz
     * @param idNumber
     * @return
     */
    public static ValidationResult validateIdNumber(ValidatorWrapper validator, Class clazz, String idNumber) {
        return validate(validator, clazz, "idNumber", idNumber);
    }

    /**
     * validate login name
     *
     * @param validator
     * @param clazz
     * @param loginName
     * @return
     */
    public static ValidationResult validateLoginName(ValidatorWrapper validator, Class clazz, String loginName) {
        return validate(validator, clazz, "loginName", loginName);
    }

    /**
     * validate email
     *
     * @param validator
     * @param clazz
     * @param email
     * @return
     */
    public static ValidationResult validateEmail(ValidatorWrapper validator, Class clazz, String email) {
        return validate(validator, clazz, "email", email);
    }
}
