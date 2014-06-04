/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 汇付生利宝账户信息.
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FssAccount extends BaseObject {

    /**
     * 总金额
     */
    String TotalAsset;

    /**
     * 历史累计收益
     */
    String TotalProfit;

    /**
     * 累计转入
     */
    @Min(0)
    private BigDecimal totalDeposit = BigDecimal.ZERO;

    /**
     * 累计转出
     */
    @Min(0)
    private BigDecimal totalWithdraw = BigDecimal.ZERO;

    /**
     * 开通时间
     */
    @NotNull
    private Date timeCreated = new Date();

    /**
     * 最后更新时间
     */
    @NotNull
    private Date timeUpdated = new Date();

    public FssAccount(String TotalAsset, String TotalProfit) {
        this.TotalAsset = TotalAsset;
        this.TotalProfit = TotalProfit;
    }
}
