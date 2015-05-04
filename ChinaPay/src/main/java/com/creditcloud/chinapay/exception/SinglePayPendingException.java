/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.exception;

import com.creditcloud.chinapay.enums.SinglePayStatCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 单笔代付返回结果中stat如果不是下面值中的s,6,9,则抛出此异常
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
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SinglePayPendingException extends RuntimeException {

    private String stat;
    /**
     *
     */
    private static final long serialVersionUID = -880871181518322810L;

    public SinglePayPendingException(String stat,String message) {
        super(message);
        this.stat=stat;
    }
}
