/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.enums;

/**
 * 费用收取的范围，本金，利息，或者本息
 *
 * @author rooseek
 */
public enum FeeScope {

    /**
     * 只对利息收费
     */
    INTEREST,
    /**
     * 只对本金收费
     */
    PRINCIPAL,
    /*
     * 对本息收费
     */
    BOTH;
}
