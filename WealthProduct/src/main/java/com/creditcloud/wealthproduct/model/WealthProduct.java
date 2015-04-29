package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.wealthproduct.WealthProductConstant;
import com.creditcloud.wealthproduct.enums.ProductStatus;
import com.creditcloud.wealthproduct.enums.ReturnMethod;
import javax.validation.constraints.Size;

/**
 *
 * @author rooseek
 */
public class WealthProduct extends BaseObject implements WealthProductConstant {

    private static final long serialVersionUID = 20140924L;

    private String id;

    @Size(max = WealthProductConstant.MAX_TITLE_LENGHT)
    private String title;

    private ReturnMethod returnMethod;

    private RepaymentMethod repayMethod;

    private ProductStatus status;

    private String userId;
    
    /**
     * 最低募集额度
     */
    private int minQuota;
    
    /**
     * 最高募集额度
     */
    private int maxQuota;

    /**
     * 实际募集金额
     */
    private int purchaseAmount;

    private int purchaseNumber;

    private ProductSchedule schedule;

    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
    
    /**
     * 是否预先生成还款计划，一般对于固定收益且线上统一结算的理财产品需要结算时预先生成，方便还款<p>
     */
    private boolean generateRepayment;
}