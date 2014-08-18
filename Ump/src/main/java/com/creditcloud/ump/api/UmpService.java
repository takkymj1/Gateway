/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.api;

import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.ump.model.UmpAccount;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.UmpIdentityType;
import java.math.BigDecimal;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 * 联动优势(UMP)相关服务
 * 
 * @author kdliu
 */
@Remote
public interface UmpService {
    
    public UmpAccount createUmpAccount(String clientCode, String userId, String userName, UmpIdentityType idType, String idCode, String mobileId);
    
    public UmpAccount getUmpAccount(String clientCode, String userId);
    
    public String getUserIdByAccountId(String clientCode, String accountId);
    
    public void submitEntRecharge(String clientCode, String notify_url, String orderId, LocalDate merDate, String payType, String rechargeMerId, String accoutId, BigDecimal amount, Bank bank);
    
    public void submitEntWithdrawal(String clientCode, String ret_url, String notify_url, String orderId, LocalDate merDate, String merId, String accountId, BigDecimal amount);

    public void bindCard(String clientCode, String umpUserId, String accountId, String accountName, UmpIdentityType idType, String idCode);
    
    public String getSignature(String clientCode, BaseRequest baseRequest);
    
    public String getSignature(String clientCode, BaseResponse baseResponse);
    
    public boolean verifyRequest(String clientCode, BaseRequest baseRequest);
    
    public boolean verifyResponse(String clientCode, BaseResponse baseResponse);
}
