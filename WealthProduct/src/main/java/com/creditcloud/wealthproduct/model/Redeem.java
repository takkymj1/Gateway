/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * redeem when time comes
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Redeem extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String id;

    private String userId;

    /**
     * 提前赎回
     */
    private boolean advance;

    private BigDecimal principal;

    private BigDecimal interest;

    private Date redeemDate;

}
