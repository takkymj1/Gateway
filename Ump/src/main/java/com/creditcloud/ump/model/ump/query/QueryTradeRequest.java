/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.query;

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
public class QueryTradeRequest extends BaseRequest {

    private String order_id;

    private String mer_date;

    private String busi_type;

    public QueryTradeRequest(String sign_type,
                                String charset,
                                String res_format,
                                String sign,
                                String mer_id,
                                String version,
                                String order_id,
                                String mer_date,
                                String busi_type) {
        super(CmdIdType.TRANSFER_SEARCH, sign_type, charset, res_format, sign, mer_id, version);
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.busi_type = busi_type;
    }

    public QueryTradeRequest(String mer_id,
                                String order_id,
                                String mer_date,
                                String busi_type) {
        super(CmdIdType.TRANSFER_SEARCH, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);;
        this.order_id = order_id;
        this.mer_date = mer_date;
        this.busi_type = busi_type;
    }
}
