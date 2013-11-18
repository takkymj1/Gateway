/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 * 交易状态
 *
 * @author rooseek
 */
public enum TransStat {

    /**
     * 成功
     */
    S,
    /**
     * 失败
     */
    F,
    /**
     * 初始
     */
    I,
    /**
     * 部分成功
     */
    P,
    /**
     * 经办
     */
    H,
    /**
     * 拒绝
     */
    R,
    /**
     * TODO 不在汇付文档中，但返回却有!<p>
     */
    N,
    /**
     * <b>不是汇付的返回状态，自定义用于表示查询对象不存在<b>
     */
    NOTEXIST;

}
