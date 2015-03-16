/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 风险评估
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiskAssessment extends BaseObject {

    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 风险测评选项对应分数列表
     */
    private String pointlist;
    
    /**
     * 风险承受能力答案列表
     */
    private String answerlist;
    
    /**
     * 评测时间
     */
    private Date timeTest;
}
