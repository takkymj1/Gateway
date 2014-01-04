/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint;

/**
 *
 * @author rooseek
 */
public interface AppointConstant {

    /**
     * 认购标题最大长度
     */
    int MAX_APPOINT_TITLE = 60;

    /**
     * 认购描述最大长度
     */
    int MAX_APPOINT_DESCRIPTION = 1000;

    /**
     * 认购募集期最短时间，单位小时
     */
    int MIN_APPOINT_TIME_OUT = 24;

    /**
     * 认购额度最小值
     */
    int MIN_QUOTA = 1000000;

    /**
     * 认购额度步进
     */
    int STEP_QUOTA = MIN_QUOTA;

    /**
     * 认购额度最大值
     */
    int MAX_QUOTA = 100000000;

}
