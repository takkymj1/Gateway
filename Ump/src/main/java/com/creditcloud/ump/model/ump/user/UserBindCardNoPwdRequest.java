/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.UmpConstant;
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
public class UserBindCardNoPwdRequest extends BaseRequest{
    
    private String notify_url;
    
    private String order_id;
    
    private String mer_date;
    
    private String user_id;
    
    private String card_id;
    
    private String account_name;
    
    private String identity_type;
    
    private String identity_code;
    
    private String cnaps_code;
    
    private String account_area;
    
    private String card_branch_name;
    
    public UserBindCardNoPwdRequest(String mer_id,
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
        super(CmdIdType.MER_BIND_CARD_NOPWD, 
              UmpConstant.SIGN_TYPE, 
              UmpConstant.ENCODE_TYPE, 
              UmpConstant.RESPONSE_FORMAT, 
              "", 
              mer_id, 
              UmpConstant.VERSION_4);
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
}