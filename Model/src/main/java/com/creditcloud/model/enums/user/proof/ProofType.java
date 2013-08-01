/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.proof;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProofType implements BaseEnum {

    ID("身份证明"),//身份证,户口本,驾照,结婚证等个人身份信息
    CREDITREPORT("信用报告"),//个人信用报告
    FAMILY("家庭情况证明"),//家庭情况  可以上传家庭人员身份证明信息
    EDUCATION("学历证明"),//最高学历证明
    INCOME("收入证明"),
    CAREER("工作证明"),
    HOUSE("房产证明"),
    CAR("车辆证明"),
    COMPANY("企业所有权证明"),//拥有公司企业全部或部分所有权
    BANK_ACCOUNT("银行账户证明"),
    FINANCIAL_ASSET("一般金融资产证明"),//股票 证券 票据 股权书 ... 等金融衍生品
    MORTGAGE("一般抵押物证明"),//古董 金银 字画等收藏品 土地/林地/矿山等所有权 使用权
    OTHERS("其他证明");

    private final String key;

    private ProofType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
