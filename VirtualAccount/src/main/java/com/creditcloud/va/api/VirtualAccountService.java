/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.va.model.VirtualAccount;
import com.creditcloud.va.model.VirtualBookingRecord;
import com.creditcloud.va.model.VirtualCashRecord;
import com.creditcloud.model.misc.PagedResult;
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
    void AccountSettle(VirtualCashRecord cashRecord);
    
    /**
     * 
     * 产生结算清单
     * 
     * @param bookingRecords 需结算的条目
     * @return 
     */
    VirtualCashRecord markSettlingRecords(List<VirtualBookingRecord> bookingRecords);
    
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
     * 添加虚拟账户
     * 
     * @param virtualAccount
     * @return 
     */
    VirtualAccount saveVirtualAccount(VirtualAccount virtualAccount);
    
     
}
