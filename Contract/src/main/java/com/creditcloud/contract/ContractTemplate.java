/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.client.Client;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author suetming
 */
@Data
@AllArgsConstructor
public class ContractTemplate {
    
    @NotNull
    private String id;
    
    /**
     * 合同模板名称
     */
    private String name;

    /**
     * 所属ClientCode
     */
    private String clientCode;
    
    /**
     * 创建日期时间
     */
    private Date timeCreated;
    
    /**
     * 模板内容
     */
    private byte[] content;
   
}
