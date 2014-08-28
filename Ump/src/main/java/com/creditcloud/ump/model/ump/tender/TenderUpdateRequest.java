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
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class TenderUpdateRequest extends BaseRequest {
    
    private String project_id;
    
    private String change_type;
    
    private String project_state;
    
    private String project_name;
    
    private String project_amount;
    
    private String project_expire_date;
    
    private String option_type;
    
    private String loan_user_id;
    
    private String loan_account_id;
    
    private String warranty_user_id;
    
    private String warranty_account_id;
    
    private String receive_user_id;
    
    private String receive_account_id;
    
    public TenderUpdateRequest(String mer_id, 
                               String project_id, 
                               String change_type, 
                               String project_state, 
                               String project_name, 
                               String project_amount, 
                               String project_expire_date, 
                               String option_type, 
                               String loan_user_id, 
                               String loan_account_id, 
                               String warranty_user_id, 
                               String warranty_account_id, 
                               String receive_user_id, 
                               String receive_account_id) {
        super(CmdIdType.MER_UPDATE_PROJECT, mer_id);
        this.project_id = project_id;
        this.change_type = change_type;
        this.project_state = project_state;
        this.project_name = project_name;
        this.project_amount = project_amount;
        this.project_expire_date = project_expire_date;
        this.option_type = option_type;
        this.loan_user_id = loan_user_id;
        this.loan_account_id = loan_account_id;
        this.warranty_user_id = warranty_user_id;
        this.warranty_account_id = warranty_account_id;
        this.receive_user_id = receive_user_id;
        this.receive_account_id = receive_account_id;
    }
    
    
}
