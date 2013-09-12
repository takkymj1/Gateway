/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.bean;

import com.creditcloud.common.validation.ValidatorWrapper;
import javax.annotation.Resource;
import javax.validation.Validator;

/**
 * wrap facility methods for all beans
 *
 * @author rooseek
 */
public abstract class BaseBean {

    @Resource
    private Validator validator;

    private ValidatorWrapper validatorWrapper;

    protected ValidatorWrapper getValidatorWrapper() {
        if (validatorWrapper == null) {
            validatorWrapper = new ValidatorWrapper(validator);
        }
        return validatorWrapper;
    }
}
