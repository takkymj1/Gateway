package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.wealthproduct.WealthProductConstant;
import com.creditcloud.wealthproduct.enums.IncomeType;
import com.creditcloud.wealthproduct.enums.ProductStatus;
import javax.enterprise.inject.Default;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 理财产品
 * 
 * @author rooseek
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProduct extends BaseObject implements WealthProductConstant {

    /**
     * 产品ID
     * 
     * @return
     */
    private String id;
    
    /**
     * 产品代码 (其他形式编码)
     * 
     * @return
     */
    @Size(max = MAX_SERIAL_LENGTH)
    private String serial;
    
    /**
     * 产品名称
     * 
     * @return
     */
    @Size(max = MAX_TITLE_LENGTH)
    @NotNull
    private String title;

    /**
     * 产品简称
     * 
     * @return
     */
    @Size(max = MAX_TITLE_LENGTH)
    private String shortTitle;
    
    /**
     * 显示名称
     * 
     * @return
     */
    @Size(max = MAX_TITLE_LENGTH)
    private String displayTitle;
    
    /**
     * 产品状态
     * 
     * @return
     */
    @NotNull
    private ProductStatus status;
    
    /**
     * 收益类型
     * 
     * @return
     */
    @NotNull
    private IncomeType incomeType;
    
    /**
     * 成立规模/募集金额
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RAISE_AMOUNT,
                        increment = AMOUNT_INCREMENT,
                        max = MAX_RAISE_AMOUNT,
                        groups = Default.class)
    @NotNull
    private Integer amount;

    /**
     * 最小成立规模/最小募集金额
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RAISE_AMOUNT,
                        increment = AMOUNT_INCREMENT,
                        max = MAX_RAISE_AMOUNT,
                        groups = Default.class)
    @NotNull
    private Integer minAmount;
    
    /**
     * 实际认购金额
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RAISE_AMOUNT,
                        increment = AMOUNT_INCREMENT,
                        max = MAX_RAISE_AMOUNT,
                        groups = Default.class)
    @NotNull
    private Integer subscribeAmount;
    
    /**
     * 实际认购数
     * 
     * @return
     */
    @NotNull
    private Integer subscribeNumber;
    
    /**
     * 产品周期
     * 
     * @return
     */
    private WealthProductSchedule schedule;

    /**
     * 投资策略、投资目标、投资范围
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String strategy;
    
    /**
     * 描述
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
    
    /**
     * 创建人
     * 
     * @return
     */
    @NotNull
    private String employeeId;
 
    /**
     * 开放募集时长 单位：天
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_TRANSFER_TIME_OUT,
                        increment = TIME_OUT_INCREMENT,
                        max = MAX_TRANSFER_TIME_OUT,
                        groups = Default.class)
    @NotNull
    private Integer timeOut;
    
    /**
     * 打款时长 单位：天
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_TIME_OUT,
                        increment = TIME_OUT_INCREMENT,
                        max = MAX_TIME_OUT,
                        groups = Default.class)
    @NotNull
    private Integer transferTimeOut;
    
    /**
     * 是否是线下的产品
     * 
     * @return
     */
    @NotNull
    private Boolean offline;
    
    /**
     * 是否预先生成还款计划，一般对于固定收益且线上统一结算的理财产品需要结算时预先生成，方便还款<p>
     */
//    private boolean generateRepayment;
}