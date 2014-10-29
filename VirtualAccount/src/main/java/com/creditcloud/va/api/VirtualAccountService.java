/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.misc.ResultMessage;
import com.creditcloud.va.model.VirtualAccount;
import com.creditcloud.va.model.VirtualBookingRecord;
import com.creditcloud.va.model.VirtualBookingRecordType;
import com.creditcloud.va.model.VirtualCashRecord;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface VirtualAccountService {
    
    /**
     * 获取平台虚拟账户
     * 
     * @return 
     */
    VirtualAccount getMainAccount();
    
    /**

     * 结算操作
     * 
     * @param cashRecord 需结算的账目
     */
    ResultMessage AccountSettle(VirtualCashRecord cashRecord);
    
    /**
     * 
     * 产生结算清单
     * 
     * @param bookingRecords 需结算的条目
     * @return 
     */
    VirtualCashRecord markSettlingRecords(List<VirtualBookingRecord> bookingRecords);
    
    /**
     * 产生结算清单
     * @param bookingRecordIds
     * @return 
     */
    VirtualCashRecord markSettlingRecords(String[] bookingRecordIds);
    
    /**
     * 查询账目
     * 
     * @param criteriaInfo
     * @return 
     */
    PagedResult<VirtualBookingRecord> listAllBookingRecord(CriteriaInfo criteriaInfo);
    
    /**
     * 查询现金账目信息
     * 
     * @param criteriaInfo
     * @return 
     */
    PagedResult<VirtualCashRecord> listAllCashRecord(CriteriaInfo criteriaInfo);
    
    /**
     * 添加一条账目记录
     * 
     * @param bookingRecord
     * @return 
     */
    VirtualBookingRecord saveVirtualBookingRecord(VirtualBookingRecord bookingRecord);
    
    /**
     * 
     * 获取账目信息
     * 
     * @return 
     */
    VirtualBookingRecord findBookingRecordById(String id);
    
    /**
     * 获取现金账目信息
     * 
     * @return 
     */
    VirtualCashRecord findCashRecordById(String id);
    
    /**
     * 添加虚拟账户
     * 
     * @param virtualAccount
     * @return 
     */
    VirtualAccount saveVirtualAccount(VirtualAccount virtualAccount);
    
     /*
     * 获取某个Owner的虚拟账户列表.
     * 
     * @param owner 虚拟账户所有者
     * @return 
     */
    List<VirtualAccount> listVirtualAccountsByOwner(RealmEntity owner);
    
    /**
     * 获取某个Owner的主要虚拟账户
     * 
     * @param owner
     * @return 
     */
    VirtualAccount getPrimaryVirtualAccountByOwner(RealmEntity owner);
    
    /**
     * 获取虚拟账号列表
     * 
     * @param criteriaInfo
     * @return 
     */
    PagedResult<VirtualAccount> listVirtualAccount(CriteriaInfo criteriaInfo); 
    
    /**
     * 根据账户名获取账号
     * 
     * @param accountName
     * @return 
     */
    VirtualAccount findByAccountName(String accountName);
    
    /**
     * 根据ID获取账号信息
     * 
     * @param id
     * @return 
     */
    VirtualAccount findAccountById(String id);
    
    /**
     *
     * 添加账目信息
     * 
     * @param accountId 账号ID
     * @param owner 账目关联的第三方信息
     * @param loanId 账目关联的标的
     * @param loanTitle
     * @param amount 金额
     * @param timeRecord 产生账目时间
     * @param recordType 账目类型
     * @return
     */
    VirtualBookingRecord createBookingRecord(String accountId,RealmEntity owner,String loanId,String loanTitle,BigDecimal amount,Date timeRecord,VirtualBookingRecordType recordType);
    
    /**
     * 获取实收账目相关的账目记录
     * 
     * @param cashRecordId
     * @return 
     */
    List<VirtualBookingRecord> listBookingRecordByCashRecord(String cashRecordId);
    
    /**
     * 校验账目是否都属于同一个客户
     * 
     * @param recordIds
     * @return 
     */
    boolean checkRecordIfOwnerTheSame(String[] recordIds);

}
