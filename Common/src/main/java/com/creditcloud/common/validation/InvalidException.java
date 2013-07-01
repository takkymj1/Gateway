/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.validation;

import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintViolation;

/**
 *
 * @author sobranie
 */
public class InvalidException extends RuntimeException {

    private final Set<Violation> violations;
    
    private InvalidException (Set<Violation> violations) {
        this.violations = violations;
    }

    public Set<Violation> getViolations() {
        return violations;
    }
    
    public int getViolationCount() {
        return violations.size();
    }
    
    static <T> InvalidException create(Set<ConstraintViolation<T>> cvs) {
        Set<Violation> result = new HashSet<>();
        if (cvs != null && cvs.size() > 0) {
            for (ConstraintViolation<T> cv : cvs) {
                result.add(new Violation(cv.getMessage(), cv.getInvalidValue(), cv.getRootBean()));
            }
        }
        return new InvalidException(result);
    }
}
