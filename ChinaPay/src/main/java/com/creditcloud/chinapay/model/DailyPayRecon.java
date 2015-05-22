/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import javax.validation.constraints.Min;
import lombok.Data;

/**
 * 每日代付对账信息.
 * 
 * @author sobranie
 */
@Data
public class DailyPayRecon implements Serializable {
    
    /**
     * 总笔数
     */
    @Min(0)
    private int totalCount;
    
    /**
     * 总金额.
     * 
     * 包括成功与失败
     */
    @Min(0)
    private BigDecimal totalAmount;
    
    /**
     * 退单笔数
     */
    @Min(0)
    private int rejectCount;
    
    /**
     * 退单金额
     */
    @Min(0)
    private BigDecimal rejectAmount;
    
    /**
     * 重汇笔数
     */
    @Min(0)
    private int rewireCount;
    
    /**
     * 重汇金额
     */
    @Min(0)
    private BigDecimal rewireAmount;
    
    /**
     * 重汇退单笔数
     */
    @Min(0)
    private int rewireRejectCount;
    
    /**
     * 重汇退单金额
     */
    @Min(0)
    private BigDecimal rewireRejectAmount;
    
    /**
     * 单条对账详情
     */
    private List<SinglePayRecon> rows = new ArrayList<>();
    
}
