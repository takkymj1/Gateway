/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

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
public class UserBindCardRequest extends BaseRequest{
    
    private String ret_url;
    
    private String notify_url;
    
    private String sourceV;
    
    private String order_id;
    
    private String mer_date;
    
    private String user_id;
    
    private String card_id;
    
    private String account_name;
    
    private String identity_type;
    
    private String identity_code;
    
    /**
     * nillable
     */
    private String cnaps_code;
    
    /**
     * nillable
     */
    private String account_area;
    
    /**
     * nillable
     */
    private String card_branch_name;
    
    private String is_open_fastPayment;
    
    public UserBindCardRequest(String mer_id,
                               String ret_url,
                               String notify_url, 
                               String order_id, 
                               String mer_date, 
                               String user_id, 
                               String card_id, 
                               String account_name, 
                               String identity_type, 
                               String identity_code, 
                               String cnaps_code, 
                               String account_area, 
                               String card_branch_name) {
        super(CmdIdType.MER_BIND_CARD, mer_id);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.user_id = user_id;
        this.card_id = card_id;
        this.account_name = account_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.cnaps_code = cnaps_code;
        this.account_area = account_area;
        this.card_branch_name = card_branch_name;
    }
    
    public UserBindCardRequest(String mer_id,
                               String ret_url,
                               String notify_url, 
                               String order_id, 
                               String mer_date, 
                               String user_id, 
                               String card_id, 
                               String account_name, 
                               String identity_type, 
                               String identity_code, 
                               String cnaps_code, 
                               String account_area, 
                               String card_branch_name,
                               String is_open_fastPayment) {
        super(CmdIdType.MER_BIND_CARD, mer_id);
        this.ret_url = ret_url;
        this.notify_url = notify_url;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.user_id = user_id;
        this.card_id = card_id;
        this.account_name = account_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.cnaps_code = cnaps_code;
        this.account_area = account_area;
        this.card_branch_name = card_branch_name;
        this.is_open_fastPayment = is_open_fastPayment;
    }

}
