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
 * 每日代扣对账信息.
 * 
 * @author sobranie
 */
@Data
public class DailyCutRecon implements Serializable {
    
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
     * 成功笔数
     */
    @Min(0)
    private int successCount;
    
    /**
     * 成功金额.
     */
    @Min(0)
    private BigDecimal successAmount;
    
    /**
     * 失败笔数
     */
    @Min(0)
    private int failCount;
    
    /**
     * 失败金额
     */
    @Min(0)
    private BigDecimal failAmount;
    
    /**
     * 单条对账详情
     */
    private List<SingleCutRecon> rows = new ArrayList<>();
}
