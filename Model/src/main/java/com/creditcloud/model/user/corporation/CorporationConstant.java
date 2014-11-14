/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.corporation;

/**
 *
 * @author rooseek
 */
public interface CorporationConstant {

    //企业名称最大长度
    int MAX_CORP_NAME = 128;

    //企业网站最大长度
    int MAX_CORP_URL = 128;

    //组织机构代码长度
    int ORG_CODE_LEN = 9;

    //营业执照编号
    int BUSI_CODE_LEN = 30;

    //税务登记号
    int TAX_CODE_LEN = 20;

    //合同章特征码
    int CONTRACT_SEAL_CODE_LEN = 20;
    
    //企业介绍最大长度 
    int MAX_CORP_DESC = 1024;

    //注册地址最大长度
    int MAX_REGI_LOC_LEN = 128;

    //营业范围最大长度
    int MAX_BUSI_SCOPE_LEN = 512;

    //营业执照公司类型最大長度
    int MAX_CORP_CTG_LEN = 128;

}
