/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.legacy;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户子账户详情
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class AccountDetail extends BaseObject {

    private static final long serialVersionUID = 20131113L;

    @NotNull
    private AcctType AcctType;

    @NotNull
    private String SubAcctId;

    @NotNull
    private BigDecimal AvlBal;

    @NotNull
    private BigDecimal AcctBal;

    @NotNull
    private BigDecimal FrzBal;

}
