/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

import com.creditcloud.model.client.Client;
import com.creditcloud.model.client.Employee;
import com.creditcloud.model.client.Role;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.Task;
import com.creditcloud.model.user.User;
import com.creditcloud.model.user.asset.RealEstate;
import com.creditcloud.model.user.asset.Vehicle;
import com.creditcloud.model.user.credit.Certificate;
import com.creditcloud.model.user.credit.Proof;
import com.creditcloud.model.user.fund.FundWithdraw;
import java.awt.Image;
import java.io.File;

/**
 * 定义实体相关的域
 *
 * @author rooseek
 */
public enum Realm implements BaseEnum {

    /**
     * 基本类型
     */
    USER("用戶", User.class),
    EMPLOYEE("员工", Employee.class),
    ROLE("角色", Role.class),
    CLIENT("客戶", Client.class),
    /**
     * 认证
     */
    PROOF("证明", Proof.class),
    CERTIFICATE("认证", Certificate.class),
    VEHICLE("车辆", Vehicle.class),
    REALESTATE("房产", RealEstate.class),
    /**
     * 借款贷款
     */
    INVEST("投标", Invest.class),
    LOAN("贷款", Loan.class),
    INVESTREPAYMENT("投资还款", InvestRepayment.class),
    LOANREPAYMENT("贷款还款", LoanRepayment.class),
    LOANREQUEST("贷款申请", LoanRequest.class),
    TASK("任务", Task.class),
    /**
     * 业务类型
     */
    WITHDRAW("取现",FundWithdraw.class),
    /**
     * 其他
     */
    IMAGE("图片", Image.class),
    FILE("文件", File.class),;
    private final String key;

    private final Class clazz;

    private Realm(String key, Class clazz) {
        this.key = key;
        this.clazz = clazz;
    }

    @Override
    public String getKey() {
        return key;
    }

    public Class getClazz() {
        return clazz;
    }
}
