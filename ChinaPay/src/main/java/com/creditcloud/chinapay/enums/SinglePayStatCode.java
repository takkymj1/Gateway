/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.enums;

import com.creditcloud.chinapay.utils.StringUtils;
import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * s	成功	交易成功	状态码为小写字母s<br>
 * 2	处理中	交易已接受	<br>
 * 3	处理中	财务已确认	<br>
 * 4	处理中	财务处理中	<br>
 * 5	处理中	已发往银行	ChinaPay已将代付交易发往银行。后续若银行返回结果，该状态会相应更新。<br>
 * 6	失败	银行已退单	银行退单，交易失败。<br>
 * 7	处理中	重汇已提交	<br>
 * 8	处理中	重汇已发送	ChinaPay已将代付交易发往银行。后续若银行返回结果，该状态会相应更新。<br>
 * 9	失败	重汇已退单	银行对重汇的代付交易退单，交易失败。<br>
 *
 * @author guohuahzang
 */
public enum SinglePayStatCode implements BaseEnum {

    SUCCESS("s", "交易成功"),
    PENDING_2("2", "交易已接受"),
    PENDING_3("3", "财务已确认"),
    PENDING_4("4", "财务处理中"),
    PENDING_5("5", "已发往银行"),
    FAIL_6("6", "银行已退单"),
    PENDING_7("7", "重汇已提交"),
    PENDING_8("8", "重汇已发送"),
    FAIL_9("9", "重汇已退单");

    private String key;

    private String reason;

    private SinglePayStatCode(final String key, final String reason) {
        this.key = key;
        this.reason = reason;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getReason() {
        return reason;
    }

    public boolean isSameAs(String stat_code) {
        String stat = StringUtils.nonNull(stat_code);
        return getKey().equalsIgnoreCase(stat.trim());
    }
}