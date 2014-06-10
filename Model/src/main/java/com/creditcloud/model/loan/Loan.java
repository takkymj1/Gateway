/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Loan extends BaseObject implements Investable {

    private static final long serialVersionUID = 20130918L;

    /**
     * UUID
     */
    @NotNull
    private String id;

    private String title;

    @NotNull
    private RepaymentMethod method;

    @Min(1)
    private int ordinal;

    @IncrementalInteger(min = LoanConstant.MIN_LOAN_AMOUNT,
                        increment = LoanConstant.LOAN_AMOUNT_INCREMENT,
                        max = LoanConstant.MAX_LOAN_AMOUNT,
                        groups = Default.class)
    private int amount;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_RATE,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_RATE,
                        groups = Default.class)
    private int rate;

    @NotNull
    private Duration duration;

    /**
     * 开放募集时间，单位：小时 timeout = 24 就是募集期为1天 最长3天
     */
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_TIME_OUT,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_TIME_OUT,
                        groups = Default.class)
    @XmlElement(name = "timeout")
    private int timeOut;

    @NotNull
    private LoanRequest loanRequest;

    /**
     * 开启投标时间
     */
    private Date timeOpen;

    /**
     * 满标时间
     */
    private Date timeFinished;

    /**
     * 结算时间
     */
    private Date timeSettled;

    /**
     * 还清时间
     */
    private Date timeCleared;

    /**
     * 有无抵押
     */
    private boolean mortgaged;

    /**
     * 投标数
     */
    private int bidNumber;

    /**
     * 实际投标金额，主要用于流标
     */
    private int bidAmount;

    @NotNull
    private LoanStatus status;

    /**
     * 此标的投标金额是否已经奖励
     */
    private boolean rewarded;

    /**
     * 如果为true表示此贷款申请以及相应标只对部分用户开放,false则对所有人开放
     */
    private boolean hidden;

    /**
     * 是否是流标后结算自动拆标生成的，同用戶手动拆标区分开
     */
    private boolean autoSplitted;

    public Loan(String id,
                String title,
                RepaymentMethod method,
                int ordinal,
                int amount,
                int rate,
                Duration duration,
                int timeOut,
                LoanStatus status,
                LoanRequest loanRequest,
                Date timeOpen,
                Date timeFinished,
                Date timeSettled,
                boolean mortgaged,
                int bidNumber,
                int bidAmount) {
        this.id = id;
        this.title = title;
        this.method = method;
        this.ordinal = ordinal;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.timeOut = timeOut;
        this.status = status;
        this.loanRequest = loanRequest;
        this.timeOpen = timeOpen;
        this.timeFinished = timeFinished;
        this.timeSettled = timeSettled;
        this.mortgaged = mortgaged;
        this.bidNumber = bidNumber;
        this.bidAmount = bidAmount;
    }

    /**
     * 当状态为开放投标时，根据timeOpen和timeOut计算剩余时间.
     *
     * 其他状态统一返回 -1
     *
     * @return 以millionsecond计算的剩余时间
     */
    public long getTimeLeft() {
        if (status == LoanStatus.OPENED) {
            long elapsed = System.currentTimeMillis() - timeOpen.getTime();
            return timeOut * 60 * 60 * 1000 >= elapsed ? timeOut * 60 * 60 * 1000 - elapsed : -1;
        }
        return -1;
    }

    /**
     * 达到满标的耗时.
     *
     * 如果timeFinished为空则返回 -1
     *
     * @return 以millionsecond计算的时间
     */
    public long getTimeElapsed() {
        if (timeOpen != null && timeFinished != null) {
            return timeFinished.getTime() - timeOpen.getTime();
        }
        return -1;
    }

    /**
     * 获取可投标金额
     *
     * @return
     */
    public int getAvailable() {
        return getAmount() - getBidAmount();
    }
}
