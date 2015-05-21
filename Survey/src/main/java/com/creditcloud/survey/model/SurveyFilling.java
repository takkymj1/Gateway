/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.survey.model.enums.FillingStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 问卷回答及填写情况
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class SurveyFilling extends BaseObject {

    private String id;

    /**
     * 关联的问卷
     */
    @NotNull
    private String surveyId;

    /**
     * 问卷填写人，用户或员工等
     */
    @NotNull
    private RealmEntity owner;
    
    /**
     * 问卷填写状态
     */
    private FillingStatus status;

    /**
     * 问卷评分
     */
    private int score;

    /**
     * 对应问卷评估等级等，如A,B,C
     */
    private String rank;

    /**
     * 具体问卷填写内容等
     */
    private String content;

    private Date timeCreated;

    private Date timeLastUpdated;
}
