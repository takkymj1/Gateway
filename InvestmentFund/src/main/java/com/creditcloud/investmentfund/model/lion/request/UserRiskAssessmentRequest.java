/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 风险承受能力再次评测
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class UserRiskAssessmentRequest extends BaseRequest {

    /**
     * 证件号码
     */
    private String certificateno;
    
    /**
     * 证件类型（0为身份证，暂时只支持身份证）
     */
    private String certificatetype;
    
    /**
     * 风险测评选项对应分数列表
     * 样例：66|6|6|10|4|2|2|6|10|6|4|2|8|10|10
     */
    private String pointlist;
    
    /**
     * 风险承受能力答案列表
     * 样例：A|C|C|A|D|E|E|C|B|C|D|E|B|A|A
     */
    private String answerlist;
    
    public UserRiskAssessmentRequest(
            String merid, 
            String idNumber, 
            String pointlist,
            String answerlist) {
        super(Attribute.doriskpaper, merid);
        
        this.certificateno = idNumber;
        this.certificatetype = "0";
        this.pointlist = pointlist;
        this.answerlist = answerlist;
    }
}
