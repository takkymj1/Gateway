/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.user.User;

/**
 *
 * @author keven
 */
public class AppointRequestExt {
    
    private User user;
    private String branch;
    private String status;
    private AppointRequest request;

    public AppointRequestExt() {
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
}
