/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.enums.loan.RepaymentMethod;

/**
 * 任何可投资的对象
 *
 * @author rooseek
 */
public interface Investable {

    /**
     * 唯一id
     *
     * @return
     */
    String getId();

    /**
     * 利率
     *
     * @return
     */
    int getRate();

    /**
     * 期限
     *
     * @return
     */
    Duration getDuration();

    /**
     * 还款方法
     *
     * @return
     */
    RepaymentMethod getMethod();
}
