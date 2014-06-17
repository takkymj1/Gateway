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
     * validate name
     *
     * @param validator
     * @param claszz
     * @param name
     * @return
     */
    public static ValidationResult validateName(ValidatorWrapper validator, Class claszz, String name) {
        ValidationResult result = new ValidationResult(name);
        try {
            validator.tryValidateValue(claszz, "name", name);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
    }

    /**
     * validate mobile
     *
     * @param validator
     * @param claszz
     * @param mobile
     * @return
     */
    public static ValidationResult validateMobile(ValidatorWrapper validator, Class claszz, String mobile) {
        ValidationResult result = new ValidationResult(mobile);
        try {
            validator.tryValidateValue(claszz, "mobile", mobile);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
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
        ValidationResult result = new ValidationResult(idNumber);
        try {
            validator.tryValidateValue(clazz, "idNumber", idNumber);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
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
        ValidationResult result = new ValidationResult(loginName);
        try {
            validator.tryValidateValue(clazz, "loginName", loginName);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
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
        ValidationResult result = new ValidationResult(email);
        try {
            validator.tryValidateValue(clazz, "email", email);
            result.setValid(true);
        } catch (InvalidException ex) {
            result.setMessage(ex.getMessage());
        }
        return result;
    }
}
