/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.loan.InvestRule;
import com.creditcloud.appoint.AppointConstant;
import com.creditcloud.appoint.enums.AppointmentStatus;
import com.creditcloud.model.constraints.IncrementalInteger;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 认购的投资产品
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class Appointment extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    private String id;

    @NotNull
    private String clientCode;

    /**
     * 认购产品标题或名称
     */
    @NotNull
    @Size(max = AppointConstant.MAX_APPOINT_TITLE)
    private String title;

    @NotNull
    private AppointmentStatus status;

    /**
     * 总认购金额限度
     */
    @IncrementalInteger(min = AppointConstant.MIN_QUOTA,
                        increment = AppointConstant.STEP_QUOTA,
                        max = AppointConstant.MAX_QUOTA)
    private int quota;

    /**
     * 已认购额度
     */
    @Min(0)
    private int amount;

    /**
     * 认购数额
     */
    @Min(0)
    private int count;

    /**
     * 投资额度控制
     */
    @NotNull
    @Valid
    private InvestRule investRule;

    @Size(max = AppointConstant.MAX_APPOINT_DESCRIPTION)
    private String description;

    /**
     * 开放募集时间
     */
    private Date timeOpened;

    /**
     * 募集期限(单位小时)
     */
    @Min(AppointConstant.MIN_APPOINT_TIME_OUT)
    private int timeOut;

    /**
     * 结束募集时间
     */
    private Date timeFinished;

    public Appointment() {
    }

    public Appointment(String id,
                       String clientCode,
                       String title,
                       AppointmentStatus status,
                       int quota,
                       int amount,
                       int count,
                       InvestRule investRule,
                       String description,
                       Date timeOpened,
                       int timeOut,
                       Date timeFinished) {
        this.id = id;
        this.clientCode = clientCode;
        this.title = title;
        this.status = status;
        this.quota = quota;
        this.amount = amount;
        this.count = count;
        this.investRule = investRule;
        this.description = description;
        this.timeOpened = timeOpened;
        this.timeOut = timeOut;
        this.timeFinished = timeFinished;
    }

    /**
     * 剩余可用认购额度
     *
     * @return
     */
    public int getAvailable() {
        return quota - amount;
    }
}
