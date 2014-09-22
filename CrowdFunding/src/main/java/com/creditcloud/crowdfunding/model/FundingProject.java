/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.crowdfunding.enums.ProjectCategory;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class FundingProject extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    private String title;

    private ProjectCategory category;

    /**
     * 项目发起人
     */
    private String userId;

    /**
     * 目标金额
     */
    private BigDecimal goalAmount;

    /**
     * 实际募集金额
     */
    private BigDecimal raiseAmount;

    /**
     * 募集笔数
     */
    private int raiseNumber;

    /**
     * 筹集天数
     */
    private int timeOut;

    /**
     * 项目视频地址
     */
    private String videoUrl;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 详情
     */
    private String detail;

}
