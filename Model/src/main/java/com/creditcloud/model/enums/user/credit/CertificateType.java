/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Arrays;
import java.util.List;

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
    REALESTATE("房产认证"),
    LOCATION("居住地认证"),
    VEHICLE("购车认证"),
    LOANPURPOSE("借款用途认证"),
    GUARANTEE("担保认证"),
    OTHERS("其他认证");

    private final String key;

    /**
     * 个人通用的认证类型，与具体贷款本身无关
     */
    private static List<CertificateType> GENERAL_TYPES = Arrays.asList(new CertificateType[]{ID, CREDITREPORT, FAMILY, EDUCATION, INCOME,
                                                                                             CAREER, REALESTATE, LOCATION, VEHICLE, GUARANTEE, OTHERS});

    private CertificateType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public static CertificateType[] all() {
        return CertificateType.values();
    }

    /**
     * 获取个人通用的认证类型，与具体贷款无关
     *
     * @return
     */
    public static List<CertificateType> getGeneralCertificate() {
        return GENERAL_TYPES;
    }
}
