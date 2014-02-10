/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分账账户,汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class DivDetail2 extends DivDetail {

    @NotNull
    private String DivCustId;

    public DivDetail2(String DivCustId, String DivAcctId, String DivAmt) {
        super(DivAcctId, DivAmt);
        this.DivCustId = DivCustId;
    }
}
