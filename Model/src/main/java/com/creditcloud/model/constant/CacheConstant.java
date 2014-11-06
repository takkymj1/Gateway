/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author suetming
 */
public interface CacheConstant {
    
    /**
     * define cache key for inner cache
     */
    String KEY_PREFIX_INNER_RESOURCE = "%1$s_%2$s";
    
    /**
     * define cache key for inner cache
     */
    String KEY_PREFIX_INNER_RESOURCE_WITH_ID = "%1$s_%2$s_%3$s";
    
    /**
     * define cache key for user account relate
     */
    String KEY_PREFIX_USER_ACCOUNT = "%1$s_ACCOUNT";
    
    /**
     * define cache key for user info relate
     */
    String KEY_PREFIX_USER_INFO = "%1$s_INFO";
    
    /**
     * define cache key for user fund relate
     */
    String KEY_PREFIX_USER_FUND = "%1$s_FUND";
    
    /**
     * define cache key for user invest relate
     */
    String KEY_PREFIX_USER_INVEST = "%1$s_INVEST";
    
    /**
     * define cache key for loan
     */
    String KEY_PREFIX_LOAN = "%1$s_LOAN";
    
    /**
     * define cache key for loan balance
     */
    String KEY_PREFIX_LOAN_BALANCE = "%1$s_LOAN_BALANCE";
    
    /**
     * define cache key for loan bid number
     */
    String KEY_PREFIX_LOAN_BID_NUMBER = "%1$s_LOAN_BID_NUMBER";
    
    /**
     * define cache key for loan amount
     */
    String KEY_PREFIX_PROJECT = "%1$s_PROJECT";
    
    /**
     * define cache key for crowd funding reward number
     */
    String KEY_PREFIX_PROJECT_REWARD_RAISE_NUMBER = "%1$s_PROJECT_REWARD_RAISE_NUMBER";
    
    /**
     * define cache key for crowd funding reward amount
     */
    String KEY_PREFIX_PROJECT_REWARD_RAISE_AMOUNT = "%1$s_PROJECT_REWARD_RAISE_AMOUNT";
}
