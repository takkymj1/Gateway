/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.Location;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.enums.client.BranchType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 客户机构，可以为总部、分公司、办事处、加盟商等等
 *
 * @author sobranie
 */
@XmlRootElement
public class Branch {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    /**
     * 所属Client的标识
     */
    @ClientCode
    private String clientCode;

    /**
     * 上级分支机构ID.
     * 
     * 可以等于client.id，表示总部
     */
    @NotNull
    private String parentId;

    /**
     * 分支机构唯一码. 在Client内唯一标识分支机构，不限定格式
     */
    @NotNull
    private String code;

    @NotNull
    private String name;

    @NotNull
    private BranchType type;

    /**
     * 地址及位置信息
     */
    @NotNull
    private Location location;

    /**
     * 负责人. 多个分支机构可以有同一个负责人 加盟店多有这种情况
     */
    @NotNull
    private Employee principal;

    /**
     * 联系人
     */
    @NotNull
    private Employee contactPerson;

    private String description;

    public Branch(String id,
                  String clientCode,
                  String parentId,
                  String code,
                  String name,
                  BranchType type,
                  Location location,
                  Employee principal,
                  Employee contactPerson,
                  String description) {
        this.id = id;
        this.clientCode = clientCode;
        this.parentId = parentId;
        this.code = code;
        this.name = name;
        this.type = type;
        this.location = location;
        this.principal = principal;
        this.contactPerson = contactPerson;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchType getType() {
        return type;
    }

    public void setType(BranchType type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employee getPrincipal() {
        return principal;
    }

    public void setPrincipal(Employee principal) {
        this.principal = principal;
    }

    public Employee getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Employee contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
