/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.creditmarket.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 最新成功投资，用于页面显示
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LatestInvest extends BaseObject {

    private String loanId;

    private String loginName;

    private BigDecimal amount;

    /**
     * 投标时间
     */
    private Date submitTime;

    public LatestInvest(String loanId, String loginName, BigDecimal amount, Date submitTime) {
        this.loanId = loanId;
        this.loginName = loginName;
        this.amount = amount;
        this.submitTime = submitTime;
    }
}
