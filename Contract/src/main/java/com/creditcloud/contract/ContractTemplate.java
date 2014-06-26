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

/**
 *
 * @author suetming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractTemplate extends BaseObject {

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
    public boolean isDefault;

    /**
     * 模板内容
     */
    private byte[] content;

    public ContractType getType() {
        //默认类型是LOAN
        return type == null ? ContractType.LOAN : type;
    }
}
