/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.misc.RealmEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 现金对账记录.
 * 
 * 保存在数据库，作为增量对账的依据
 * 
 * @author sobranie
 */
@Data
public class CashReconRecord implements Serializable {
    
    /**
     * 在对账时段终点时，根据平台记账推算出的理论余额.
     * 
     * 由上次对账的balanceTheory累加对账期期间的CashFlowStat而得来的
     */
    private BigDecimal balanceTheory;
    
    /**
     * 在对账时段终点时，线下账户中实际的资金余额.
     * 
     * 一般是operator根据实际情况填写的
     */
    private BigDecimal balanceActual;

    /**
     * <strong>对账期</strong>时间起点
     */
    @NotNull
    private Date timeReconBegin;
    
    /**
     * <strong>对账期</strong>时间终点
     */
    @NotNull
    private Date timeReconEnd;
    
    /**
     * 添加这笔对账的操作者，一般是 Employee
     */
    @NotNull
    private RealmEntity operator;
    
    /**
     * 批准这笔对账的操作者，一般是 Employee
     */
    private RealmEntity approver;
    
    /**
     * note comment
     */
    private String comment;
    
    /**
     * 记录时间
     */
    @NotNull
    private Date timeRecorded;
}
