/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeepay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 商户资金账户
 *
 * @author sobranie
 */
@Data
@XmlRootElement
public class ClientAccount implements Serializable {

    /**
     * 基本户余额（往来）
     */
    private BigDecimal baseBalance;

    /**
     * 风险金账户余额
     */
    private BigDecimal riskBalance;

    /**
     * 服务费账户余额
     */
    private BigDecimal serviceBalance;

    /**
     * 计算商户账户总余额
     *
     * @return
     */
    public BigDecimal balance() {
        return baseBalance.add(riskBalance).add(serviceBalance);
    }

    /**
     * 根据子账户类型获取子账户余额
     * 
     * @param type
     * @return 
     */
    public BigDecimal byType(SubAccountType type) {
        switch (type) {
            case BASE:
                return baseBalance;
            case RISK:
                return riskBalance;
            case SERVICE:
                return serviceBalance;
            default:
                return BigDecimal.ZERO;
        }
    }
}
