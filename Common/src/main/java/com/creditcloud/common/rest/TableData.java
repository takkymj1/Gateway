/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.User;
import com.creditcloud.model.misc.PagedResult;
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
    User.class
})
public class TableData<T> extends BaseObject {

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

    public TableData(final PagedResult pr,
                     final int sEcho) {
        this.results = pr.getResults();
        this.totalResords = pr.getTotalSize();
        this.totalDisplayRecords = pr.getTotalSize();
        this.sEcho = sEcho;
    }
}
