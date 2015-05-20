/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.api;

import com.creditcloud.survey.model.Survey;
import javax.ejb.Remote;

/**
 * 管理问卷本身的接口.
 * 
 * 创建、细化问卷，控制问卷状态等
 * 
 * @author sobranie
 */
@Remote
public interface SurveyManagementService {
    
    /**
     * 创建一个新的问卷
     * 
     * @param clientCode
     * @param survey
     * @return
     */
    public Survey createSurvey(String clientCode, Survey survey);
    
    
}
