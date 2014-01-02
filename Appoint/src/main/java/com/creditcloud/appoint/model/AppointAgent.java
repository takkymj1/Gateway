/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 认购代理人,代理人会对应到多个机构，代理人是机构的资金归集
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class AppointAgent extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    /**
     * 代理人本身也是特殊的user
     */
    @NotNull
    private String userId;

    @NotNull
    private String description;

    /**
     * 认购配额
     */
    @Min(0)
    private int quota;

    /**
     * 剩余额度
     */
    private int available;

    /**
     * 认购数目
     */
    private int count;

    public AppointAgent() {
    }

    public AppointAgent(String userId, String description, int quota, int available, int count) {
        this.userId = userId;
        this.description = description;
        this.quota = quota;
        this.available = available;
        this.count = count;
    }
}
