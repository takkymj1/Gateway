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
     * 借款类型
     */
    LOAN_TYPE("借款类型"),
    /**
     * 借款附加利率
     */
    LOAN_ADDTIONAL_RATE("借款附加利率"),
    /**
     * 企业关联法人
     */
    LEGAL_PERSON("企业关联法人"),
    /*
     * 融资企业
     */
    FINANCE_CORPORATION("融资企业"),
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
    USERGROUP("用户组"),
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
    CREDITASSIGN("债权转让"),
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
    TRANSFER("转账"),
    /**
     * CMS管理
     */
    CHANNEL("CMS栏目"),
    ARTICLE("CMS文章"),
    /**
     * Crowd funding
     */
    FUNDINGPROJECT("众筹项目"),
    FUNDINGINVEST("众筹投资"),
    PROJECTLOAN("众筹放款"),
    FUNDINGREWARD("众筹奖励"),
    FUNDINGLIKE("众筹点赞"),
    /**
     * 其他
     */
    MOBILE("手机号"),
    CONTRACT("合同"),
    CONTRACTTEMPLATE("合同模板"),
    BROKERAGE_CONTRACTTEMPLATE("居间合同模板"),
    CONTRACTSEAL("合同章"),
    IMAGE("图片"),
    FILE("文件"),
    FSS("生利宝"),
    TICKET("支持工单"),
    BATCHJOB("批量任务"),
    PAGES("页面"),
    BATCH("批量导入"),
    COUPON("奖券"),
    
    /**
     * 原始债权
     */
    CLAIM("CLAIM"),
    
    /**
     * 合同模板
     */
    CONTRACTTEMPLATE_O2O("合同模板一对一"),
    CONTRACTTEMPLATE_O2M("合同模板一对多"),
    
    /**
     * 序列号
     */
    SERIALNUMBER("序列号"),
    
    /**
     * 担保审计
     */
    GUARANTEE_AUDIT("GUARANTEE_AUDIT"),
    /**
     * 订单
     */
    ORDER("订单"),
    /**
     * 系统
     */
    SYSTEM("系统"),
    /**
     * 自定义产品，限制了投标人的范围
     */
    PRIVATE_LOAN_PRODUCT("自定义产品"),
    /**
     * 保险
     */
    INSURANCE_ORDER("保险订单"),
    
    /**
     * 保险
     */
    INSURANCE_PRODUCT("保险产品"),
    /**
     * 保险
     */
    INSURANCE_PRODUCT_FAVORITE("保险产品收藏"),
    /**
     * 基金
     */
    INVESTMENT_FUND_PRODUCT("基金"),
    /**
     * 基金收藏
     */
    INVESTMENT_FUND_PRODUCT_FAVORITE("基金收藏"),

    /**
     * CMS文章收藏
     */
    CMS_ARTICLE_FAVORITE("文章收藏"),
    
    /**
     * 理财产品
     */
    WEALTH_PRODUCT("理财产品"),
    
    /**
     * 理财产品收藏
     */
    WEALTH_PRODUCT_FAVORITE("理财产品收藏");
    
    private final String key;

    private Realm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
