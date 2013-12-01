/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.enums;

/**
 * 收费方式
 *
 * @author rooseek
 */
public enum FeeType {

    /**
     * 固定费用,跟具体金额无关,如取现费每次两元
     */
    FIXED,
    /**
     * 浮动费用=amount*费率，跟具体金额有关
     */
    FLOATING,
    /**
     * 费用＝固定费用+浮动费用,跟固定费用和具体金额都相关，如实地征信费＝500+贷款金额*0.1%
     */
    BOTH,
    /**
     * 两者都不用,实际就是零费用
     */
    NONE;

}
