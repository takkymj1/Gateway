/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.misc.ContractSealType;
import com.creditcloud.model.user.User;
import com.creditcloud.model.user.corporation.CorporationUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 公章 for FMAX
 * @author suetming
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Seal extends BaseObject {
    
    private static final long serialVersionUID = 20140801L;
    
    private String id;
    
    // 公章特性码 or 私章证书ID
    private String code;
    
    // 印章类型
    private ContractSealType type;
    
    // 印章内容
    private byte[] content;
    
    // 关联实体ID
    private String entityId;
    
    private User user;
    
    private CorporationUser corporationUser;
    
    @Override
    public String toString(){
        return ReflectionToStringBuilder.toStringExclude(this, "content");
    }
    
}
