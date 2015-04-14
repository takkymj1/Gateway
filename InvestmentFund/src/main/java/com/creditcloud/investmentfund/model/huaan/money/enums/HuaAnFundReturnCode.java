/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.enums;

/**
 *
 * @author guohuazhang
 */
public enum HuaAnFundReturnCode {

    SUCCESS("0000", "操作成功"), APPLICATION_ACCEPTED("0999", "交易委托已受理");

    private String code;
    private String message;

    private HuaAnFundReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;

    }
}
