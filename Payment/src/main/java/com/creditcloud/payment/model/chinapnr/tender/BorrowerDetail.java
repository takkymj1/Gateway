/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.model.BaseObject;
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
    @Size(max = 12)
    private String BorrowerAmt;

    /**
     * 借款手续费率
     */
    @Size(max = 6)
    private String BorrowerRate;

    public BorrowerDetail() {
    }

    public BorrowerDetail(String BorrowerCustId, String BorrowerAmt, String BorrowerRate) {
        this.BorrowerCustId = BorrowerCustId;
        this.BorrowerAmt = BorrowerAmt;
        this.BorrowerRate = BorrowerRate;
    }

    public String getBorrowerCustId() {
        return BorrowerCustId;
    }

    public void setBorrowerCustId(String BorrowerCustId) {
        this.BorrowerCustId = BorrowerCustId;
    }

    public void setBorrowerAmt(String BorrowerAmt) {
        this.BorrowerAmt = BorrowerAmt;
    }

    public void setBorrowerRate(String BorrowerRate) {
        this.BorrowerRate = BorrowerRate;
    }

    public String getBorrowerAmt() {
        return BorrowerAmt;
    }

    public String getBorrowerRate() {
        return BorrowerRate;
    }
}
