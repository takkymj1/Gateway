package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.loan.RepaymentPeriod;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 与RepaymentMethod结合应用，来调整还款表的生成.
 *
 * <strong>DTO同时也是Embeddable</strong>
 *
 * @author sobranie
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RepaymentRule extends BaseEntity {

    private static final long serialVersionUID = 20150427L;

    /**
     * 一年按照多少天计算.
     *
     * 可能的取值有360、365、366，默认365
     *
     * 主要用在按日一次性还本付息的计算中
     */
    @Min(360)
    @Max(365)
    private int daysOfYear = 365;

    /**
     * 对于多次还款的几种方式，规定的还款周期.
     *
     * 可以按月、双月、按季度、半年以及一年
     */
    @Enumerated(EnumType.STRING)
    private RepaymentPeriod repaymentPeriod = RepaymentPeriod.Monthly;

    /**
     * 固定日还款，还款的日期(day of month).
     *
     * 1~31 表示日期，0表示非固定日还款(按照起息日/结标日推算)
     */
    @Min(0)
    @Max(31)
    private int dayOfRepayment = 0;

}
