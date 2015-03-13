/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.api;

import com.creditcloud.model.BaseObject;


/**
 *
 * @author tinglany
 */
public class Result extends BaseObject {
    private String Status;
    
    private String Key;
    
    private String Code;
    
    private String Message;

    public Result() {
    }

    public Result(String Status, String Key, String Code, String Message) {
        this.Status = Status;
        this.Key = Key;
        this.Code = Code;
        this.Message = Message;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getStatus() {
        return Status;
    }

    public String getKey() {
        return Key;
    }

    public String getCode() {
        return Code;
    }

    public String getMessage() {
        return Message;
    }
    
}
