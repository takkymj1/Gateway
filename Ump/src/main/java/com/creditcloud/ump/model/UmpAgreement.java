/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class UmpAgreement {

    private String accountName;

    private String userId;

    /**
     * 无密快捷协议
     */
    private boolean instant;

    /**
     * 无密投资协议
     */
    private boolean invest;

    /**
     * 无密还款协议
     */
    private boolean repay;

    /**
     * 借记卡快捷协议
     */
    private boolean debit;
    
    /**
     * 卡号暂存，UMP绑卡结果只包含经过遮挡的卡号
     */
    private String cardNo;
}
