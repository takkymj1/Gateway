/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import lombok.Data;

/**
 * 选择题的选项
 * 
 * @author sobranie
 */
@Data
public class Choice implements Serializable {
    
    /**
     * A、B、C、D等
     */
    @NotNull
    @FormParam("value")
    private String value;
    
    /**
     * 内容
     */
    @NotNull
    @FormParam("content")
    private String content;
    
    /**
     * SIMPLE类型的调查问卷时，每个选项的分值
     */
    @FormParam("score")
    private int score;
}
