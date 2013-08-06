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
public enum CertificateType implements BaseEnum {

    ID("身份认证"),//身份证,户口本,驾照,结婚证等个人身份信息
    CREDITREPORT("信用报告"),//个人信用报告
    FAMILY("家庭情况认证"),//家庭情况  可以上传家庭人员身份证明信息
    EDUCATION("学历认证"),//最高学历证明
    INCOME("收入认证"),
    CAREER("工作认证"),
    HOUSE("房产认证"),
    LOCATION("居住地认证"),
    CAR("购车认证"),
    MOBILE("手机认证"),
    D("实地认证"),
    OTHERS("其他认证");

    private final String key;

    private CertificateType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
