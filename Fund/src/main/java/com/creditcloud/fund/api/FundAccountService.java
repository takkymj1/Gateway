/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.FundAccount;
import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.user.fund.BankAccount;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FundAccountService {

    /**
     *
     * @param clientCode
     * @param userId
     * @param account
     * @return
     */
    public boolean setDefaultAccountByUser(String clientCode,
                                           String userId,
                                           String account);

    /**
     *
     * @param clientCode
     * @param userId
     * @param account
     * @return
     */
    public boolean deleteByUserAndAccount(String clientCode,
                                          String userId,
                                          String account);

    /**
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public List<FundAccount> listAccountByUser(String clientCode,
                                               String userId);

    /**
     * 添加银行卡到用户名下.
     *
     * 重复添加也会返回true
     *
     * @param clientCode
     * @param userId
     * @param userName
     * @param bank
     * @param account
     * @param valid
     * @param isDefault
     * @return
     */
    public boolean addBankCard(String clientCode,
                               String userId,
                               String userName,
                               Bank bank,
                               String account,
                               boolean valid,
                               boolean isDefault);

    /**
     *
     * @param clientCode
     * @param userId
     * @param bankAccount
     * @param valid
     * @param isDefault
     * @return
     */
    public boolean addBankCard(String clientCode,
                               String userId,
                               BankAccount bankAccount,
                               boolean valid,
                               boolean isDefault);

    /**
     * get FundAccount by user and account
     *
     * @param clientCode
     * @param userId
     * @param account
     * @return
     */
    public FundAccount getByUserAndAccount(String clientCode,
                                           String userId,
                                           String account);
    
    /**
     * 获取用户默认银行卡账户
     * 
     * @param clientCode
     * @param userId
     * @return 
     */
    public FundAccount getDefaultByUser(String clientCode,
                                        String userId);
    
}
