package com.creditcloud.model.enums;

/**
 * 定义实体相关的域
 *
 * @author rooseek
 * @author 老叶 新增债权转让合同模板Realm
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
    USER_CORPORATION("企业关联的用户"),//银河国际借款人
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
    CREDITASSIGNINVEST("债权转让投资"),
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
    STATISTICS("数据统计"),
    /**
     * Crowd funding
     */
    FUNDINGPROJECT("众筹项目"),
    FUNDINGDREAM("众筹梦想"),
    FUNDINGINVEST("众筹投资"),
    PROJECTLOAN("众筹放款"),
    FUNDINGREWARD("众筹奖励"),
    FUNDINGLIKE("众筹点赞"),
    FUNDINGSPACIALTOPIC("众筹专题页"),//一个众筹项目只允许属于一个专题
    FUNDINGXIAOHUAJIA("中网小画家"),
    /**
     * 其他
     */
    MOBILE("手机号"),
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
     * 合同相关
     */
    CONTRACT("合同"),
    CONTRACTSEAL("合同章"),
    CONTRACTTEMPLATE("合同模板"),
    CONTRACTTEMPLATE_O2O("合同模板一对一"),
    CONTRACTTEMPLATE_O2M("合同模板一对多"),
    BROKERAGE_CONTRACTTEMPLATE("居间合同模板"),
    FUNDING_CONTRACTTEMPLATE("众筹合同模板"),
    ASSIGN_CONTRACTTEMPLATE("债权转让合同模板"),
    
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
     * 文章收藏
     */
    CMS_ARTICLE_FAVORITE("文章收藏"); 

    private final String key;

    private Realm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
