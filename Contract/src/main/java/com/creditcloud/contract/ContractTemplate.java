/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.client.Client;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author suetming
 */
@Data
public class ContractTemplate {
    
    @NotNull
    private String id;
    
    /**
     * 合同模板名称
     */
    private String name;

    /**
     * 所属Client
     */
    private Client client;
    
    /**
     * 创建日期时间
     */
    private Date timeCreated;
    
    /**
     * 模板内容
     */
    private byte[] content;
    
    public ContractTemplate(String id, String name, byte [] content, Date timeCreated) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.timeCreated = timeCreated;
    }
}
