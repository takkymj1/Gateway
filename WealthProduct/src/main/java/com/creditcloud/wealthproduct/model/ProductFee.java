/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class ProductFee extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String productId;

    private BigDecimal purchaseFee;

    private BigDecimal manageFee;

    private BigDecimal redeemFee;

    private BigDecimal advanceRedeemFee;

    public ProductFee(String productId,
                      BigDecimal purchaseFee,
                      BigDecimal manageFee,
                      BigDecimal redeemFee,
                      BigDecimal advanceRedeemFee) {
        this.productId = productId;
        this.purchaseFee = purchaseFee;
        this.manageFee = manageFee;
        this.redeemFee = redeemFee;
        this.advanceRedeemFee = advanceRedeemFee;
    }
}
