/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

/**
 *
 * @author rooseek
 */
public class FundingReward {

    private int id;
    
    private int projectId;

    /**
     * 投资金额
     */
    private int amount;

    /**
     * 限定名额
     */
    private int limit;

    /**
     * 回报内容
     */
    private String description;

    /**
     * 回报/交付时间:项目结束后**天
     */
    private String deliveryTime;

}
