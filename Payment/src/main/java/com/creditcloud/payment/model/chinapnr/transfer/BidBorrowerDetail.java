/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 债权转让明细中的投标信息
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class BidBorrowerDetail extends BaseObject {

    @NotNull
    @Size(max = 16)
    private String BorrowerCustId;

    @NotNull
    @Size(max = 14)
    private String BorrowerCreditAmt;

    @NotNull
    @Size(max = 14)
    private String PrinAmt;

    public BidBorrowerDetail(String BorrowerCustId, String BorrowerCreditAmt, String PrinAmt) {
        this.BorrowerCustId = BorrowerCustId;
        this.BorrowerCreditAmt = BorrowerCreditAmt;
        this.PrinAmt = PrinAmt;
    }
}
