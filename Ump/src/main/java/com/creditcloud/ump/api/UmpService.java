/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.api;

import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.ump.model.UmpAccount;
import com.creditcloud.ump.model.UmpAgreement;
import com.creditcloud.ump.model.UmpEntUser;
import com.creditcloud.ump.model.UmpTender;
import com.creditcloud.ump.model.UmpTransaction;
import com.creditcloud.ump.model.UmpTransferResult;
import com.creditcloud.ump.model.UmpUser;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.AccountType;
import com.creditcloud.ump.model.ump.enums.ParticAccountType;
import com.creditcloud.ump.model.ump.enums.TransferAction;
import com.creditcloud.ump.model.ump.enums.UmpBusiType;
import com.creditcloud.ump.model.ump.enums.UmpIdentityType;
import java.math.BigDecimal;
import java.util.List;
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
    
    public boolean createUmpAgreement(String clientCode, String userId, String accountId, boolean isDebitAgreement);
    
    public boolean updateUmpAgreement(String clientCode, UmpAgreement agreement);
    
    public UmpAgreement getUmpAgreement(String clientCode, String userId);
    
    public void submitEntRecharge(String clientCode, String notify_url, String orderId, LocalDate merDate, String payType, String rechargeMerId, String accoutId, BigDecimal amount, Bank bank);
    
    public void submitEntWithdrawal(String clientCode, String ret_url, String notify_url, String orderId, LocalDate merDate, String merId, String accountId, BigDecimal amount);

    public void bindCard(String clientCode, String umpUserId, String accountId, String accountName, UmpIdentityType idType, String idCode);
    
    public UmpTransferResult transfer(String clientCode, String ret_url, String notify_url, String orderId, LocalDate merDate, String merAccountId, ParticAccountType umpAccountType, String umpAccountId, String umpAccountName, TransferAction action, BigDecimal amount);
    
    public String getSignature(String clientCode, BaseRequest baseRequest);
    
    public String getSignature(String clientCode, BaseResponse baseResponse);
    
    public boolean verifyRequest(String clientCode, BaseRequest baseRequest);
    
    public boolean verifyResponse(String clientCode, BaseResponse baseResponse);
    
    public UmpTransaction queryTrans(String clientCode, String orderId, String merDate, UmpBusiType busiType);
    
    public UmpUser queryUser(String clientCode, String userId);
    
    public UmpTender queryTender(String clientCode, String tenderId);
    
    public List<UmpTransaction> queryUserTransSeq(String clientCode, String accountId, AccountType accountType, LocalDate from, LocalDate to, int startPage);
    
    public UmpEntUser queryEntUser(String clientCode, String accountId);
    
    public boolean createTender(String clientCode, String tenderId, String tenderName, BigDecimal amount, LocalDate expireDate, String umpUserId, String umpAccountId, String umpWarrantyUserId, String umpWarrantyAccountId);

    public boolean scheduleTender(String clientCode, String tenderId, String tenderName, BigDecimal amount, LocalDate expireDate);
    
    public boolean openTender(String clientCode, String tenderId);
    
}
