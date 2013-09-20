/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

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

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private final String name;

    /**
     * 拥有该权限的所有员工
     */
    private final Collection<Employee> members;

    /**
     * 该角色所拥有的权限集合
     */
    private final Collection<Privilege> privileges;

    public Role(String name, Collection<Employee> members, Collection<Privilege> privileges) {
        this.name = name;
        this.members = members;
        this.privileges = privileges;
    }

    public String getName() {
        return name;
    }

    public Collection<Employee> getMembers() {
        return members;
    }

    public Collection<Privilege> getPrivileges() {
        return privileges;
    }
}
