package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户持有份额查询
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryFundShareRequest extends BaseRequest {

    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
 
    public QueryFundShareRequest(String merid, String idNumber){
        super(Attribute.getshare, merid);
        this.certificateno = idNumber;
        this.certificatetype = "0";
    }
}