/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeepay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
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
     * 基本户可用余额（往来）
     */
    @Min(0)
    private BigDecimal bookAccountAvailable;
    
    /**
     * 基本户冻结（往来）
     */
    @Min(0)
    private BigDecimal bookAccountFreeze;

    /**
     * 风险金账户余额
     */
    @Min(0)
    private BigDecimal riskAccountBalance;

    /**
     * 服务费账户余额
     */
    @Min(0)
    private BigDecimal serviceAccountBalance;

    /**
     * 计算商户账户总余额
     *
     * @return
     */
    public BigDecimal balance() {
        return bookAccountAvailable.add(riskAccountBalance).add(serviceAccountBalance);
    }

    /**
     * 根据子账户类型获取子账户余额
     * 
     * @param type
     * @return 
     */
    public BigDecimal byType(SubAccountType type) {
        switch (type) {
            case BOOK:
                return bookAccountAvailable;
            case RISK:
                return riskAccountBalance;
            case SERVICE:
                return serviceAccountBalance;
            default:
                return BigDecimal.ZERO;
        }
    }
}
