/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.factoring;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 保理业务
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Factoring extends BaseObject {

    private static final long serialVersionUID = 20140702;

    private static final String CENTRALBANCK_REGISTER_NO_SEPERATOR = ",";

    /**
     * 此id与借款申请id一一对应
     */
    @NotNull
    private String id;

    /**
     * 关联保理公司
     */
    @NotNull
    private String factoringCorporation;

    /**
     * 央行登记号,可能是一个或者多个,如果是多个则用逗号分隔
     */
    @NotNull
    private String centralBankRegisterNo;

    //优质民营，上市公司，地方国企，大型央企
    private String type;

    /**
     * 应收账款
     */
    @Min(0)
    private int receivables;

    /**
     * 关联融资企业
     */
    private String financeCorporation;

    /**
     * 关联债务企业描述
     */
    private String debtDescription;

    /**
     * 保理项目介绍
     */
    private String description;

    protected Date timeCreated;

    protected Date timeLastUpdated;

    public Factoring(String id,
                     String factoringCorporation,
                     String centralBankRegisterNo,
                     String type,
                     int receivables,
                     String financeCorporation,
                     String debtDescription,
                     String description) {
        this.id = id;
        this.factoringCorporation = factoringCorporation;
        this.centralBankRegisterNo = centralBankRegisterNo;
        this.type = type;
        this.receivables = receivables;
        this.financeCorporation = financeCorporation;
        this.debtDescription = debtDescription;
        this.description = description;
    }

    /**
     * 拆分centralBankRegisterNo
     *
     * @param centralBankRegisterNo
     * @return
     */
    public static String[] fromCentralBankRegisterNo(String centralBankRegisterNo) {
        if (centralBankRegisterNo == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return StringUtils.split(centralBankRegisterNo, CENTRALBANCK_REGISTER_NO_SEPERATOR);
    }

    /**
     * 组合centralBankRegisterNo
     *
     * @param strs
     * @return
     */
    public static String toCentralBankRegisterNo(String[] strs) {
        if (strs == null) {
            return null;
        }
        return StringUtils.join(strs, CENTRALBANCK_REGISTER_NO_SEPERATOR);
    }
}
