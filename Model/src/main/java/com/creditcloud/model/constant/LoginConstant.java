/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author rooseek
 */
public interface LoginConstant {
    
    /**
     * 在锁定用户之前最多密码登录失败错误的次数.
     * 
     * 连续失败超过此数目用户自动被锁定而不能登录.
     */
    int MAX_ATTEMPTS = 4;

    String IP = "ip";

    String IMEI = "imei";

}
