/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 交易状态，记录交易在三方支付的状态
 *
 * @author rooseek
 */
public enum TransStat implements BaseEnum {

    /**
     * 成功
     */
    S("成功"),
    /**
     * 失败
     */
    F("失败"),
    /**
     * 初始
     */
    I("初始"),
    /**
     * 部分成功
     */
    P("部分成功"),
    /**
     * 经办
     */
    H("经办"),
    /**
     * 拒绝
     */
    R("拒绝"),
    /**
     * 查询对象在三方支付不存在
     */
    NOTEXIST("不存在"),
    /**
     * 无需跟三方支付结算
     */
    NOTRANS("无交易"),
    /**
     * 对汇付表示,查询自动投标状态表示开启!
     */
    N("开启"),
    /**
     * 对汇付表示,查询自动投标状态表示关闭!
     */
    C("关闭"),;

    private final String key;

    private TransStat(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
