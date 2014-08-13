/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投资人发布的债权转让
 *
 * @author rooseek
 */
@XmlRootElement
public class CreditAssign extends BaseObject {

    private static final long serialVersionUID = 20140811L;

    private String id;
    
    private CreditAssignStatus status;

    /**
     * 转让人
     */
    private String userId;

    /**
     * 债权转让转出的本金
     */
    private BigDecimal creditAmount;
    
    /**
     * 债权转让折价率
     */
    private BigDecimal creditDealRate;

    /**
     * 债权转让标价
     */
    private BigDecimal creditDealAmount;

    private String loanId;

    private String investId;

    /**
     * 该债权对应的未还还款 
     */
    private List<Repayment> repayment;
    
    private Date timeOpen;
    
    /**
     * 承接期，单位小时
     */
    private int timeOut;
    
    private Date timeFinished;
    
    /**
     * 结算时间
     */
    private Date timeSettled;
}
