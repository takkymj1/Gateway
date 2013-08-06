/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProofSource implements BaseEnum {

    PERSONAL("个人"),//用户个人上传
    SYSTEM("系统后台"),//操作员后台上传
    MOBILE_TERMINAL("移动终端")//操作员通过手机、平板等移动终端上传
    ;

    private final String key;

    private ProofSource(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
