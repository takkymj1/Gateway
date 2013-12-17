/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.enums;

/**
 * 收费的周期单位，例如以天为单位来收取逾期罚金
 *
 * @author rooseek
 */
public enum FeePeriod {

    /**
     * 一次性收
     */
    SINGLE,
    /**
     * 按天收
     */
    DAILY,
    /**
     * 按星期收
     */
    WEEKLY,
    /**
     * 按月收
     */
    MONTHLY,
    /**
     * 按年收
     */
    YEARLY;
}
