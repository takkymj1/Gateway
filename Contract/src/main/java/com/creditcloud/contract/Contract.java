/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.enums.loan.ContractConfirmStatus;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.user.User;
import java.util.Date;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 合同对象
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract extends BaseObject {
    
    private static final long serialVersionUID = 20140627L;
    
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
    
    /**
     * 合同编号
     */
    private String contractNo;
    
    /**
     * 合同是否已经被确认
     */
    private ContractConfirmStatus confirmStatus;
    
    @Override
    public String toString(){
        return ReflectionToStringBuilder.toStringExclude(this, "content");
    }
}
