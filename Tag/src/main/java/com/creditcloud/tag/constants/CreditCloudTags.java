/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.constants;

import com.creditcloud.model.enums.Realm;
import com.creditcloud.tag.model.Tag;

/**
 * 预定义的tags
 *
 * @author rooseek
 */
public interface CreditCloudTags {

    /**
     * VIP客户
     */
    Tag VIP_USER = new Tag(Realm.STRING, "VIP", "VIP", "贵宾客户");

    /**
     * 用户账号可以关联到另一个用户账号
     */
    Tag USER_CONNECT_ACCOUNT = new Tag(Realm.STRING, "关联账号", "关联账号", "关联账号");

    /**
     * 借款中间人
     */
    Tag LOAN_AGENT = new Tag(Realm.STRING, "借款中间人", "借款中间人", "借款中间人");

    /**
     * 平台运营方相关的内部客户
     */
    Tag INTERNAL_USER = new Tag(Realm.STRING, "内部用户", "内部用户", "内部用户客户");

    /**
     * 个人用途借款
     */
    Tag LOAN_PERSONAL = new Tag(Realm.STRING, "个人借款", "个人借款", "个人借款");

    /**
     * 个人代表企业借款
     */
    Tag LOAN_COMPANY = new Tag(Realm.STRING, "企业借款", "企业借款", "个人代表企业借款");

    /**
     * 个人代表企业借款时用的企业名称，一般标记在LoanRequest上
     */
    Tag COMPANY_NAME = new Tag(Realm.STRING, "企业名称", "企业名称", "借款企业名称");

    /**
     * 个人代销理财产品
     */
    Tag LOAN_WEALTH = new Tag(Realm.STRING, "理财产品", "理财产品", "个人代销理财产品");

    /**
     * 三方合同模板，一般标记在LoanRequest对象上，内容为ContractTemplate的ID
     */
    Tag CONTRACT_TEMPLATE = new Tag(Realm.CONTRACTTEMPLATE, "合同模板", "三方合同模板", "适用的三方合同模板");

    /**
     * 居间合同模板，一般标记在LoanRequest对象上，内容为ContractTemplate的ID
     */
    Tag BROKERAGE_CONTRACT_TEMPLATE = new Tag(Realm.BROKERAGE_CONTRACTTEMPLATE, "居间合同模板", "居间合同模板", "适用的居间合同模板");

    /**
     * 新手标
     */
    Tag NEWBIE_LOAN = new Tag(Realm.LOAN_TYPE, "新手标", "新手标", "借款类型");

    /**
     * 云艺贷
     */
    Tag ART_LOAN = new Tag(Realm.LOAN_TYPE, "云艺贷", "云艺贷", "借款类型");

    /**
     * 首页推荐标
     */
    Tag RECOMMEND_LOAN = new Tag(Realm.LOAN_TYPE, "推荐标", "推荐标", "借款类型");
}
