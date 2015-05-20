/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model;

import java.util.List;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.survey.model.enums.SurveyType;
import com.creditcloud.survey.model.enums.SurveyStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import lombok.Data;

/**
 * 问卷基础类
 * 
 * @author sobranie
 */
@Data
public class Survey implements Serializable {
    
    @UUID
    @FormParam("id")
    private String id;
    
    @NotNull
    @FormParam("title")
    private String title;
    
    @NotNull
    @FormParam("type")
    private SurveyType type;
    
    @NotNull
    @FormParam("status")
    private SurveyStatus status;

    /**
     * 问卷的创建者
     */
    @NotNull
    private RealmEntity creator;
    
    /**
     * 创建时间
     */
    @NotNull
    private Date timeCreated;
    
    /**
     * 题目列表
     */
    private List<Question> questions = new ArrayList<>();
}
