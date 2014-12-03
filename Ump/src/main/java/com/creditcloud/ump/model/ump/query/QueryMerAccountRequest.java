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
@ToString(callSuper = true)
public class QueryMerAccountRequest extends BaseRequest {

    private String query_mer_id;

    private String account_type;

    public QueryMerAccountRequest(String sign_type,
                                  String charset,
                                  String res_format,
                                  String sign,
                                  String mer_id,
                                  String version,
                                  String query_mer_id,
                                  String account_type) {
        super(CmdIdType.PTP_MER_QUERY, sign_type, charset, res_format, sign, mer_id, version);
        this.query_mer_id = query_mer_id;
        this.account_type = account_type;
    }

    public QueryMerAccountRequest(String mer_id,
                                  String query_mer_id,
                                  String account_type) {
        super(CmdIdType.PTP_MER_QUERY, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.VERSION_1);;
        this.query_mer_id = query_mer_id;
        this.account_type = account_type;
    }

}
