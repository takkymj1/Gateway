/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.validator;

import com.creditcloud.model.constraints.PNRReturnURL;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author rooseek
 */
public class PNRReturnURLValidator implements ConstraintValidator<PNRReturnURL, String> {

    private static final String[] reserved = new String[]{"recv",
                                                          "rbsmag",
                                                          "cashmag",
                                                          "cash",
                                                          "ubs",
                                                          "acctmag",
                                                          "buser",
                                                          "busermag",
                                                          "mtp",
                                                          "mtpmag",
                                                          "muser",
                                                          "musermag",
                                                          "ubsmag",
                                                          "mag"};

    @Override
    public void initialize(PNRReturnURL constraintAnnotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
