/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author tinglany
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReconciliationResultData<T> extends BaseObject {

    @XmlElement(name = "sEcho")
    private int sEcho;

    @XmlElement(name = "iTotalRecords")
    private int totalResords;

    @XmlElement(name = "iTotalDisplayRecords")
    private int totalDisplayRecords;

    @XmlElement(name = "aaData")
    private List<T> results;
    

    public ReconciliationResultData() {
    }

    public ReconciliationResultData(final PagedResult pr,
                                    final int sEcho) {
        results = pr.getResults();
        totalResords = pr.getTotalSize();
        totalDisplayRecords = pr.getTotalSize();
        this.sEcho = sEcho;
    }
}
