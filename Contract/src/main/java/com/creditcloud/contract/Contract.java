/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.user.User;
import java.util.Date;
import java.util.Map;

/**
 * 合同对象
 *
 * @author sobranie
 */
public class Contract extends BaseObject {
    
    /**
     * 合同编号
     */
    private String id;
    
    /**
     * 合同名称
     */
    private String name;

    /**
     * 合同类型
     */
    private ContractType type;
    
    /**
     * 所属Client
     */
    private Client client;
    
    /**
     * 关联实体
     */
    private RealmEntity entity;
    
    /**
     * 合同参与方（用户）
     */
    private Map<ContractParty, User> userRelated;
    
    /**
     * 签署日期时间
     */
    private Date timeCreated;
    
    /**
     * 合同内容
     */
    private byte[] content;
    
    public Contract() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public RealmEntity getEntity() {
        return entity;
    }

    public void setEntity(RealmEntity entity) {
        this.entity = entity;
    }

    public Map<ContractParty, User> getUserRelated() {
        return userRelated;
    }

    public void setUserRelated(Map<ContractParty, User> userRelated) {
        this.userRelated = userRelated;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
