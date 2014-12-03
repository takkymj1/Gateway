/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.tender;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.ToString;

/**
 * 建立标的账户的请求
 * 
 * @author kdliu
 */
@Data
@ToString(callSuper = true)
public class TenderCreateRequest extends BaseRequest {

    private String project_id;

    private String project_name;

    private String project_amount;

    private String project_expire_date;

    private String loan_user_id;

    private String loan_account_id;

    /**
     * 借款方账户类型，默认为01（个人）
     */
    private String loan_acc_type;
    /**
     * nillable
     */
    private String warranty_user_id;

    /**
     * nillable
     */
    private String warranty_account_id;

    public TenderCreateRequest(String mer_id,
                               String project_id,
                               String project_name,
                               String project_amount,
                               String project_expire_date,
                               String loan_user_id,
                               String loan_account_id,
                               String loan_acc_type,
                               String warranty_user_id,
                               String warranty_account_id) {
        super(CmdIdType.MER_BIND_PROJECT, mer_id);
        this.project_id = project_id;
        this.project_name = project_name;
        this.project_amount = project_amount;
        this.project_expire_date = project_expire_date;
        this.loan_user_id = loan_user_id;
        this.loan_account_id = loan_account_id;
        this.loan_acc_type = loan_acc_type;
        this.warranty_user_id = warranty_user_id;
        this.warranty_account_id = warranty_account_id;
    }

}
