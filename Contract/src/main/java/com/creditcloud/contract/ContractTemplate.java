/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 *
 * @author suetming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractTemplate extends BaseObject {
    
    private static final long serialVersionUID = 20140627L;
    
    @NotNull
    private String id;

    /**
     * 合同模板名称
     */
    private String name;

    /**
     * 合同模板类型
     */
    private ContractType type;

    /**
     * 创建日期时间
     */
    private Date timeCreated;

    /**
     * 是否为默认模板
     */
    private boolean isDefault;

    /**
     * 模板内容
     */
    private byte[] content;

    public ContractType getType() {
        //默认类型是LOAN
        return type == null ? ContractType.LOAN : type;
    }

    public static ContractTemplate copyOf(ContractTemplate original, boolean includeContent) {
        return new ContractTemplate(original.getId(),
                                    original.getName(),
                                    original.getType(),
                                    original.getTimeCreated(),
                                    original.isDefault(),
                                    includeContent ? original.getContent() : ArrayUtils.EMPTY_BYTE_ARRAY);
    }
    
    public String toString(){
        return ReflectionToStringBuilder.toStringExclude(this, "content");
    }
}
