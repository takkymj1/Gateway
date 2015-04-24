/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.wealthproduct.WealthProductConstant;
import com.creditcloud.wealthproduct.enums.ReturnMethod;
import com.creditcloud.wealthproduct.enums.WealthProductStatus;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class WealthProduct extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String id;

    @Size(max = WealthProductConstant.MAX_TITLE_LENGHT)
    private String title;

    private ReturnMethod returnMethod;

    private RepaymentMethod repayMethod;

    private WealthProductStatus status;

    private String userId;

    private int rate;

    private Duration duration;

    private int amount;

    private int purchaseAmount;

    private int purchaseNumber;

    private ProductSchedule schedule;

    @Size(max = WealthProductConstant.MAX_DESCRIPTION_LENGTH)
    private String description;

    public WealthProduct(String id,
                         String title,
                         ReturnMethod returnMethod,
                         RepaymentMethod repayMethod,
                         WealthProductStatus status,
                         String userId,
                         int rate,
                         Duration duration,
                         int amount,
                         ProductSchedule schedule,
                         String description) {
        this.id = id;
        this.title = title;
        this.returnMethod = returnMethod;
        this.repayMethod = repayMethod;
        this.status = status;
        this.userId = userId;
        this.rate = rate;
        this.duration = duration;
        this.amount = amount;
        this.schedule = schedule;
        this.description = description;
    }

    public int getLeftAmount() {
        return amount - purchaseAmount;
//      BigDecimal result = amount.subtract(purchaseAmount);
//      return result.signum() == -1 ? BigDecimal.ZERO : result;
    }

//    private InvestRule investRule;
//
//    private boolean allowAdvanceRedeem;
}
