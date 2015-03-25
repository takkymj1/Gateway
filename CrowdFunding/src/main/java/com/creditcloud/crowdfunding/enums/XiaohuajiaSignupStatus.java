/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;
import javax.json.Json;

/**
 * 中网小画家 报名状态
 * @author zaishu.ye@fengjr.com
 */
public enum XiaohuajiaSignupStatus implements BaseEnum {
    SIGNUP("可报名"),
    UPLOAD("待上传作品"),
    VERIFY("审核中"),
    VERIFY_FAILED("审核未通过"),
    VERIFY_SUCCESS("审核通过"),
    ZC_CREATED("众筹已创建"),
    ZC_FINISHED("众筹完成");
    
    private final String key;

    private XiaohuajiaSignupStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String toJsonString(){
        return Json.createObjectBuilder().add(this.getClass().getSimpleName(), this.name()).build().toString();
    }
}
