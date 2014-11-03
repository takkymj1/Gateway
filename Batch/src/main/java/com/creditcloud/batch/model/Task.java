/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.constraints.UUID;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;

/**
 * 一个批处理中的任务
 * 
 * @author sobranie
 */
public abstract class Task {
    
    @Getter
    @UUID
    @NotNull
    private String id;
    
    /**
     * 该Task在BatchJob中的序号，从1开始
     */
    @Getter
    @Min(1)
    private int ordinal;
    
    @Getter
    @NotNull
    private TaskStatus status;
    
    @Getter
    private Date timeExecuted;
    
    /**
     * 该条记录的原始信息
     */
    @Getter
    @NotNull
    private String source;
    
}
