/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import javax.persistence.Embeddable;

/**
 *
 * @author rooseek
 */
@Embeddable
public class Range<T extends Comparable<T>> extends BaseEntity{
    
    private T upper;
    
    private T lower;

    public Range() {
    }

    public Range(T lower, T upper) {
        this.upper = upper;
        this.lower = lower;
    }

    public T getUpper() {
        return upper;
    }

    public T getLower() {
        return lower;
    }

    public void setUpper(T upper) {
        this.upper = upper;
    }

    public void setLower(T lower) {
        this.lower = lower;
    }
    
    
}
