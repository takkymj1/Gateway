/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.util.Collection;
import javax.validation.constraints.NotNull;

/**
 * 员工角色.
 *
 * 某些员工可以具有多重角色，但绝大多数只有唯一角色
 *
 * @author sobranie
 */
public class Role {

    @NotNull
    private String name;

    /**
     * 拥有该权限的所有员工
     */
    private Collection<Employee> members;

    /**
     * 该角色所拥有的权限集合
     */
    private Collection<Privilege> privileges;

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Employee> getMembers() {
        return members;
    }

    public void setMembers(Collection<Employee> members) {
        this.members = members;
    }

    public Collection<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Collection<Privilege> privileges) {
        this.privileges = privileges;
    }
}
