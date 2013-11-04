/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CreditRank;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用户信用及认证<p>
 * 信用额度之类只针对贷款
 *
 * @author rooseek
 */
@XmlRootElement
public class UserCredit extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String userId;

    //信用等级
    @NotNull
    private CreditRank creditRank;

    //信用评分
    @NotNull
    private Assessment assessment;

    //信用额度
    @NotNull
    @Min(0)
    private int creditLimit;

    //可用额度
    @NotNull
    @Min(0)
    private int creditAvailable;

    @NotNull
    private String lastModifiedBy;

    @NotNull
    private Date timeCreated;

    @NotNull
    private Date timeLastUpdated;

    public UserCredit(String userId,
                      CreditRank creditRank,
                      Assessment assessment,
                      int creditLimit,
                      int creditAvailable,
                      String lastModifiedBy,
                      Date timeCreated,
                      Date timeLastUpdated) {
        this.userId = userId;
        this.creditRank = creditRank;
        this.assessment = assessment;
        this.creditLimit = creditLimit;
        this.creditAvailable = creditAvailable;
        this.lastModifiedBy = lastModifiedBy;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
    }

    public CreditRank getCreditRank() {
        return creditRank;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditAvailable() {
        return creditAvailable;
    }

    public void setCreditRank(CreditRank creditRank) {
        this.creditRank = creditRank;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditAvailable(int creditAvailable) {
        this.creditAvailable = creditAvailable;
    }

    public String getUserId() {
        return userId;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
