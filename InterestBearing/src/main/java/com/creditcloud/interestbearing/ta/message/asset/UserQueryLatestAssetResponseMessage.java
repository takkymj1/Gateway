/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserQueryLatestAssetResponseMessage extends ResponseMessage {
    //总计投入生息本金, 有可能为负(减计提现), 两位小数
    private String book_value;
    //累计收益
    private String accumulated_earning;
    //对应accounting_time的资产市值, 四位小数
    private String fair_value;
    //记账时间
    private String accouting_time;
}
