/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model;

import com.creditcloud.model.constraints.UUID;
import com.creditcloud.survey.model.enums.QuestionType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import lombok.Data;

/**
 * 问卷中的问题
 * 
 * @author sobranie
 */
@Data
public class Question implements Serializable {
    
    @UUID
    private String id;
    /**
     * 题目序号.
     * 
     * 从 <b>1</b> 开始
     */
    @Min(1)
    @FormParam("ordinal")
    private int ordinal;
    
    /**
     * 题目表述
     */
    @NotNull
    @FormParam("content")
    private String content;
    
    /**
     * 题目类型
     */
    @NotNull
    @FormParam("type")
    private QuestionType type;
    
    /**
     * 选择题类型才有选项列表
     */
    private List<Choice> choices = new ArrayList<>();
}
