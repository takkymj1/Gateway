/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.incrementalinteger;

import com.creditcloud.model.constraints.IncrementalInteger;

/**
 *
 * @author rooseek
 */
public class MockInteger {

    @IncrementalInteger(min = 10000, increment = 1000, max = 1000000)
    private int value;

    public MockInteger(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
