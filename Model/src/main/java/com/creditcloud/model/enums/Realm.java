/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 定义实体相关的域
 *
 * @author rooseek
 */
public enum Realm implements BaseEnum {

    /**
     * 代表跟realm关联的field仅仅是个字符串，不是系统内的实体
     */
    STRING("字符串"),
    /**
     * 名值对，用于存放额外信息，key和value用|分隔
     */
    KEYVALUE("名值对"),
    /**
     * 影子标显示的借款人
     */
    SHADOW_BORROWER("影子标显示的借款人"),
    /**
     * 企业关联法人
     */
    LEGAL_PERSON("企业关联法人"),
    /**
     * 基本类型
     */
    USER("用戶"),
    CORPORATIONUSER("企业用户"),
    EMPLOYEE("员工"),
    ROLE("角色"),
    CLIENT("客戶"),
    BRANCH("分支机构"),
    CORPORATION("企业"),//注意不是平台用户
    /**
     * 认证
     */
    PROOF("证明"),
    CERTIFICATE("认证"),
    VEHICLE("车辆"),
    REALESTATE("房产"),
    /**
     * 借款贷款
     */
    INVEST("投标"),
    LOAN("贷款"),
    INVESTREPAYMENT("投资还款"),
    LOANREPAYMENT("贷款还款"),
    LOANREQUEST("贷款申请"),
    TASK("任务"),
    APPOINTMENT("认购"),
    /**
     * 业务类型
     */
    FUND("资金"),
    WITHDRAW("取现"),
    /**
     * **
     * CMS管理
     */
    CHANNEL("CMS栏目"),
    ARTICLE("CMS文章"),
    /**
     * 其他
     */
    MOBILE("手机号"),
    CONTRACT("合同"),
    CONTRACTTEMPLATE("合同模板"),
    IMAGE("图片"),
    FILE("文件");

    private final String key;

    private Realm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
