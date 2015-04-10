/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import com.creditcloud.common.security.PrivacyDimmer;
import com.creditcloud.fund.model.UserFund;
import com.creditcloud.fund.model.record.FundWithdraw;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.User;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 *
 * @author keven
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@XmlSeeAlso(value = {
    User.class,
    UserFund.class,
    FundWithdraw.class
})
public class TableData<T> extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    @XmlElement(name = "sEcho")
    private int sEcho;

    @XmlElement(name = "iTotalRecords")
    private int totalResords;

    @XmlElement(name = "iTotalDisplayRecords")
    private int totalDisplayRecords;

    @XmlElement(name = "aaData")
    private List<T> results;

    public TableData() {
    }

    public TableData(final PagedResult<T> pr,
                     final int sEcho,
                     final boolean dim) {
        results = pr.getResults();
        totalResords = pr.getTotalSize();
        totalDisplayRecords = pr.getTotalSize();
        this.sEcho = sEcho;
        //dim
        if (dim) {
            for (T t : results) {
                PrivacyDimmer.dim(t);
            }
        }
    }
}
