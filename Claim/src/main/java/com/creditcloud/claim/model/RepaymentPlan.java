/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.claim.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author ceusan
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class RepaymentPlan extends BaseObject {

    private static final long serialVersionUID = 20140804L;

    /**
     * 原始债权ID
     */
    @FormParam("claimId")
    private String claimId;

    /**
     * 还款期数
     */
    @FormParam("period")
    private int period;

    /**
     * 还款日期
     */
    @FormParam("repaymentDate")
    private Date repaymentDate;
    
    /**
     * 还款金额
     */
    @FormParam("repaymentAmount")
    private BigDecimal repaymentAmount;
    
    
    

}
