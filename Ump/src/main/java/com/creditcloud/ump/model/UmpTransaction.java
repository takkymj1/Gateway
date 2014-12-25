/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UmpTransaction extends BaseObject {

    private String orderId;

    private String checkDate;

    private String merDate;

    private String transactionId;

    /**
     * 取值范围： 01充值 02提现 03标的转账 04转账
     *
     */
    private String busiType;

    private String amount;

    private String fee;

    private String cashDirection;

    /*
     * 01充值： 2成功、3失败、4不明、6其他 
     * 02提现： 0初始、1受理中、2成功、3失败、4不明、5交易关闭（提现）、6其他
     * 03标的转账： 0初始、2成功、3失败、4不明、6其他 
     * 04转账： 0初始、2成功、3失败、4不明、6其他
     *
     */
    private String tranState;

    private String smsNum;

}
