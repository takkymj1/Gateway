/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 证明类型，对基本认证类型的扩展
 *
 * @author rooseek
 */
public enum ProofType implements BaseEnum {

    /**
     * 身份证明
     */
    ID_CARD("身份证", CertificateType.ID),
    ID_HUKOU("户口本", CertificateType.ID),
    ID_SOCIAL_SECURITY("社保", CertificateType.ID),
    ID_DRIVE_LICENCE("驾照", CertificateType.ID),
    ID_MARITAL("结婚证", CertificateType.ID),
    ID_DIVORSE("离婚证", CertificateType.ID),
    ID_VIDEO("本人视频", CertificateType.ID),
    ID_OTHER("其他个人身份证明", CertificateType.ID),
    /**
     * 工作经营证明
     */
    CAREER_LABOUR_CONTRACT("劳动合同", CertificateType.CAREER),
    CAREER_LABOUR_CERTIFICATE("技术职称及技能认证", CertificateType.CAREER),
    CAREER_BUSINESS_LICENCE("营业执照", CertificateType.CAREER),
    CAREER_TAX_REGISTRATION("税务登记证", CertificateType.CAREER),
    CAREER_ORGANIZATION_REGISTRATION("组织机构代码证", CertificateType.CAREER),
    CAREER_SANITARY_LICENCE("卫生许可证", CertificateType.CAREER),
    CAREER_BUSINESS_CONTRACT("经营相关合同", CertificateType.CAREER),
    CAREER_BUSINESS_CERTIFICATE("经营相关许可证", CertificateType.CAREER),
    CAREER_BUSINESS_PLACE("经营或施工场所", CertificateType.CAREER),
    CAREER_OTHER("其他工作相关证明", CertificateType.CAREER),
    /**
     * 收入认证证明
     */
    INCOME_BANKACCOUNT("银行流水", CertificateType.INCOME),
    INCOME_SALARY("工资证明", CertificateType.INCOME),
    INCOME_OTHER("其他收入证明", CertificateType.INCOME),
    /**
     * 房产证明
     */
    RE_HOUSE_PROPERTY("住房权证或合同", CertificateType.REALESTATE),
    RE_HOUSE_PICTURE("住房照片", CertificateType.REALESTATE),
    RE_LAND_PROPERTY("土地权证或合同", CertificateType.REALESTATE),
    RE_LAND_PICTURE("土地照片", CertificateType.REALESTATE),
    RE_FACTORY_PROPERTY("厂房权证或合同", CertificateType.REALESTATE),
    RE_FACTORY_PICTURE("厂房照片", CertificateType.REALESTATE),
    RE_WAREHOUSE_PICTURE("仓库照片", CertificateType.REALESTATE),
    RF_OTHER("其他房产相关证明", CertificateType.REALESTATE),
    /**
     * 车辆证明
     */
    VEHICLE_LICENCE("行驶证", CertificateType.VEHICLE),
    VEHICLE_PROPERTY("车辆权证或合同发票", CertificateType.VEHICLE),
    VEHICLE_PICTURE("车辆照片", CertificateType.VEHICLE),
    VEHICLE_OTHER("其他车辆相关证明", CertificateType.VEHICLE),
    /**
     * 担保证明
     */
    GUARANTEE_ID("担保人身份", CertificateType.GUARANTEE),
    GUARANTEE_REALESTATE("担保人房产", CertificateType.GUARANTEE),
    GUARANTEE_OTHER("其他担保相关证明", CertificateType.GUARANTEE),
    /**
     * 邮箱
     */
    EMAIL("邮箱认证", CertificateType.EMAIL),
    /**
     * 手机
     */
    MOBILE("手机认证", CertificateType.MOBILE),
    /**
     * 信用报告
     */
    CREDIT_REPORT("信用报告", CertificateType.CREDITREPORT),
    /**
     * 贷款用途
     */
    LOAN_PURPOSE("贷款用途", CertificateType.LOANPURPOSE),
    /**
     * 家庭情況认证
     */
    FAMILY("家庭情况", CertificateType.FAMILY),
    /**
     * 学历认证
     */
    EDUCATION("学历", CertificateType.EDUCATION),
    /**
     * 居住地
     */
    LOCATION("居住地", CertificateType.LOCATION),
    /**
     * OTHER
     */
    OTHER_SINA_WEIBO("新浪微博", CertificateType.OTHERS),
    OTHER_TECENT_WEIBO("腾讯微博", CertificateType.OTHERS),
    OTHER_QQ("腾讯QQ", CertificateType.OTHERS);

    private final String key;

    private final CertificateType certificateType;

    private ProofType(String key, CertificateType certificateType) {
        this.key = key;
        this.certificateType = certificateType;
    }
    private static final HashMap<CertificateType, List<ProofType>> proofMap = new HashMap<>();

    static {
        for (CertificateType type : CertificateType.values()) {
            proofMap.put(type, new ArrayList<ProofType>());
        }

        for (ProofType type : ProofType.values()) {
            proofMap.get(type.getCertificateType()).add(type);
        }
    }

    @Override
    public String getKey() {
        return key;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    /**
     * list related proof type by certificate type
     *
     * @param type
     * @return
     */
    public List<ProofType> listByCertificate(CertificateType type) {
        return proofMap.get(type);
    }
}
