/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.user.User;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author keven
 */
@XmlRootElement
public class AppointRequestExt {

    private User user;
    private String branch;
    private String status;
    private AppointRequest request;
    /**
     * 预约实体
     */
    private Object obj;
    /**
     * 预约对象名称
     */
    private String targetName;

    public AppointRequestExt() {
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request,
                             String targetName) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
        this.targetName = targetName;
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request,
                             String targetName,
                             Object obj) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
        this.targetName = targetName;
        this.obj = obj;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequest(AppointRequest request) {
        this.request = request;
    }

    public String getBranch() {
        return branch;
    }

    public String getStatus() {
        return status;
    }

    public AppointRequest getRequest() {
        return request;
    }

    /**
     * @return the targetName
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * @param targetName the targetName to set
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * @return the obj
     */
    public Object getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }
}
