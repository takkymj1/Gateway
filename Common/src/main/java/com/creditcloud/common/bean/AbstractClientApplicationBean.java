/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.bean;

import com.creditcloud.model.client.Client;
import com.creditcloud.model.exception.ClientCodeNotMatchException;

/**
 * 基础的ApplicationBean.
 *
 * 一般是@Singleton，需要与判断本地Client相关的对象和方法
 *
 * @author sobranie
 */
public abstract class AbstractClientApplicationBean {

    protected Client client;
    
    public Client getClient() {
        return client;
    }

    public String getClientCode() {
        return client == null ? null : client.getCode();
    }

    /**
     *
     * check incoming client code, but do not throw exception
     *
     * @param clientCode
     * @return true if clientCode is null or equal to local client code
     */
    public boolean isValid(String clientCode) {
        if (clientCode != null && !clientCode.equals(getClientCode())) {
            return false;
        }
        return true;
    }

    /**
     * check incoming client code, throw exception if invalid
     *
     * @param clientCode
     * @throws ClientCodeNotMatchException
     */
    public abstract void checkClientCode(String clientCode);
}
