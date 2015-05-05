/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.wealthproduct.WealthProductConstant;
import static com.creditcloud.wealthproduct.WealthProductConstant.AMOUNT_INCREMENT;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_RAISE_AMOUNT;
import static com.creditcloud.wealthproduct.WealthProductConstant.MIN_RAISE_AMOUNT;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 收益区间，每个理财产品可以有多个收益区间，默认按照投资金额
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmountRateRange implements WealthProductConstant {

    /**
     * 对应理财产品id
     * 
     * @return
     */
    @NotNull
    private String productId;

    /**
     * 档位名称
     * 
     * @return
     */
    @NotNull
    @Size(max = MAX_TITLE_LENGTH)
    private String title;
    
    /**
     * 最低投资额
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RAISE_AMOUNT,
                        increment = AMOUNT_INCREMENT,
                        max = MAX_RAISE_AMOUNT,
                        groups = Default.class)
    private int minAmount;

    /**
     * 最高投资额
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RAISE_AMOUNT,
                        increment = AMOUNT_INCREMENT,
                        max = MAX_RAISE_AMOUNT,
                        groups = Default.class)
    private int maxAmount;

    /**
     * 收益率
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = RATE_INCREMENT,
                        max = MAX_RATE)
    private int rate;

    /**
     * 档位描述
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
}
