/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 分账账户
 *
 * @author rooseek
 */
@XmlRootElement
public class DivDetail extends BaseObject {

    private static final long serialVersionUID = 20131115L;

    @NotNull
    private String DivAcctId;

    @NotNull
    private String DivAmt;

    public DivDetail() {
    }

    public DivDetail(String DivAcctId, String DivAmt) {
        this.DivAcctId = DivAcctId;
        this.DivAmt = DivAmt;
    }

    public void setDivAcctId(String DivAcctId) {
        this.DivAcctId = DivAcctId;
    }

    public void setDivAmt(String DivAmt) {
        this.DivAmt = DivAmt;
    }

    public String getDivAcctId() {
        return DivAcctId;
    }

    public String getDivAmt() {
        return DivAmt;
    }
}
