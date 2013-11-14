/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 借款人信息
 *
 * @author rooseek
 */
@XmlRootElement
public class BorrowerDetail extends BaseObject {

    private static final long serialVersionUID = 20131114L;

    /**
     * 借款人汇付账号
     */
    @NotNull
    @Size(max = 16)
    private String BorrowerCustId;

    /**
     * tou借款金额
     */
    @NotNull
    private BigDecimal BorrowerAmt;

    /**
     * 借款手续费率
     */
    private BigDecimal BorrowerRate;

    public BorrowerDetail() {
    }

    public BorrowerDetail(String BorrowerCustId, BigDecimal BorrowerAmt, BigDecimal BorrowerRate) {
        this.BorrowerCustId = BorrowerCustId;
        this.BorrowerAmt = BorrowerAmt.setScale(2);
        this.BorrowerRate = BorrowerRate.setScale(2);
    }


    public String getBorrowerCustId() {
        return BorrowerCustId;
    }

    public BigDecimal getBorrowerAmt() {
        return BorrowerAmt;
    }

    public BigDecimal getBorrowerRate() {
        return BorrowerRate;
    }

    public void setBorrowerCustId(String BorrowerCustId) {
        this.BorrowerCustId = BorrowerCustId;
    }

    public void setBorrowerAmt(BigDecimal BorrowerAmt) {
        this.BorrowerAmt = BorrowerAmt;
    }

    public void setBorrowerRate(BigDecimal BorrowerRate) {
        this.BorrowerRate = BorrowerRate;
    }
}
