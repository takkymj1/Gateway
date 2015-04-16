/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.base;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class RiskItem extends BaseObject {
    
    private String frms_ware_category;
    
    private String  user_info_mercht_userno;
       
    private String user_info_dt_register;
    
    private String user_info_full_name;
    
    private String user_info_id_no;
    
    private String user_info_identify_state;
    
    private String user_info_identify_type;

    public RiskItem() {
    }

    public RiskItem(String frms_ware_category, 
                    String user_info_mercht_userno,
                    String user_info_dt_register, 
                    String user_info_full_name, 
                    String user_info_id_no, 
                    String user_info_identify_state, 
                    String user_info_identify_type) {
        this.frms_ware_category = frms_ware_category;
        this.user_info_mercht_userno = user_info_mercht_userno;
        this.user_info_dt_register = user_info_dt_register;
        this.user_info_full_name = user_info_full_name;
        this.user_info_id_no = user_info_id_no;
        this.user_info_identify_state = user_info_identify_state;
        this.user_info_identify_type = user_info_identify_type;
    }
    
}
