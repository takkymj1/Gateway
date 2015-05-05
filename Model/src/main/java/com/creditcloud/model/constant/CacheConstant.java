/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 * cache constant
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
     * define cache key for inner user feedback cache
     */
    String KEY_PREFIX_FEEDBACK = "FEEDBACK";
    
    /**
     * define cache key for user fund relate
     */
    String KEY_PREFIX_USER_FUND = "%1$s_FUND";
    
    /**
     * define cache key for user agreement relate
     */
    String KEY_PREFIX_USER_AGREEMENT = "%1$s_AGREEMENT";
    
    /**
     * define cache key for user invest relate
     */
    String KEY_PREFIX_USER_INVEST = "%1$s_INVEST";
    
    /**
     * define cache key for user invest project relate
     */
    String KEY_PREFIX_USER_INVEST_PROJECT = "%1$s_INVEST_PROJECT";
    
    /**
     * define cache key for user favorite project relate
     */
    String KEY_PREFIX_USER_FAVORITE_PROJECT = "%1$s_FAVORITE_PROJECT";
    
    /**
     * define cache key for user create project relate
     */
    String KEY_PREFIX_USER_CREATE_PROJECT = "%1$s_CREATE_PROJECT";
    
    /**
     * define cache key for loan list (for invalidate cache)
     */
    String KEY_PREFIX_LOAN_LIST = "LOAN_LIST";
    
    /**
     * define cache key for loan (for invalidate cache)
     */
    String KEY_PREFIX_LOAN = "%1$s_LOAN";
    
    /**
     * define cache key for loan invest list (for invalidate cache)
     */
    String KEY_PREFIX_LOAN_INVEST_LIST = "%1$s_LOAN_INVEST_LIST";
    
    /**
     * define cache key for loan balance
     */
    String KEY_PREFIX_LOAN_BALANCE = "%1$s_LOAN_BALANCE";
    
    /**
     * define cache key for loan invest amount
     */
    String KEY_PREFIX_LOAN_INVEST_AMOUNT = "%1$s_LOAN_INVEST_AMOUNT";
    
    /**
     * define cache key for loan bid number
     */
    String KEY_PREFIX_LOAN_BID_NUMBER = "%1$s_LOAN_BID_NUMBER";
    
    /**
     * define cache key for loan amount (for invalidate cache)
     */
    String KEY_PREFIX_PROJECT = "%1$s_PROJECT";
    
    /**
     * define cache key for project list (for invalidate cache)
     */
    String KEY_PREFIX_PROJECT_LIST = "PROJECT_LIST";
    
    /**
     * define cache key for project tag list (for invalidate cache)
     */
    String KEY_PREFIX_PROJECT_TAG_LIST = "PROJECT_TAG_LIST";
    
    /**
     * define cache key for crowd funding raise number
     */
    String KEY_PREFIX_PROJECT_RAISE_NUMBER = "%1$s_PROJECT_RAISE_NUMBER";
         
    /**
     * define cache key for crowd funding raise amount
     */
    String KEY_PREFIX_PROJECT_RAISE_AMOUNT = "%1$s_PROJECT_RAISE_AMOUNT";
    
    /**
     * define cache key for crowd funding reward list
     */
    String KEY_PREFIX_PROJECT_REWARD_LIST = "%1$s_PROJECT_REWARD_LIST";
    
    /**
     * define cache key for crowd funding reward
     */
    String KEY_PREFIX_PROJECT_REWARD = "%1$s_PROJECT_REWARD";
    
    /**
     * define cache key for crowd funding reward available number
     */
    String KEY_PREFIX_PROJECT_REWARD_AVAILABLE_NUMBER = "%1$s_PROJECT_REWARD_AVAILABLE_NUMBER";
    
    /**
     * define cache key for crowd funding reward raise number
     */
    String KEY_PREFIX_PROJECT_REWARD_RAISE_NUMBER = "%1$s_PROJECT_REWARD_RAISE_NUMBER";
    
    /**
     * define cache key for captcha mobile
     */
    String KEY_PREFIX_CAPTCHA_MOBILE = "%1$s_%2$s_CAPTCHA_MOBILE";
    
    /**
     * define cache key for captcha
     */
    String KEY_PREFIX_CAPTCHA = "%1$s_%2$s_CAPTCHA";
    
    /**
     * define cache key for proof list (not use for now)
     */
    String KEY_PREFIX_PROOF_LIST = "PROOF_LIST";
    
    /**
     * define cache key for context
     */
    String KEY_PREFIX_CONTEXT = "CONTEXT";
    
    /**
     * define cache key for CMS
     */
    String KEY_PREFIX_CMS = "%1$s%2$s_CMS"; 
    
    /**
     * define cache key for credit market (only for local call)
     */
    String KEY_PREFIX_LOCAL_CREDITMARKET = "CREDIT_MARKET_%1$s";
    
    /**
     * define cache key for task 
     */
    String KEY_PREFIX_TASK = "Quartz_%s" ;
    
    /**
     * define ceche key for fund nav
     */
    String KEY_PREFIX_FUND_NAV = "FUND_NAV_%1$s_%2$s";
}
