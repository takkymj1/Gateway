/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代表一个批量任务
 * 
 * @author sobranie
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchJob implements Serializable {
    
    @UUID
    @NotNull
    private String id;
    
    @NotNull
    private String name;
    
    @NotNull
    private BatchJobType type;
    
    @NotNull
    private BatchJobStatus status;
    
    /**
     * 任务提交者，一般为员工、也可能为企业或者系统等
     */
    @NotNull
    private RealmEntity submitter;
    
    /**
     * 触发任务执行者.
     * 
     * null if not started
     */
    private RealmEntity executor;
    
    /**
     * 任务提交时间
     */
    @NotNull
    private Date timeSubmitted;
    
    /**
     * 任务开始时间.
     * 
     * null if not started
     */
    private Date timeStarted;
    
    /**
     * 任务结束时间.
     * 
     * 不区分任务最终成功或者失败
     * 
     * null if not finished
     */
    private Date timeFininshed;
    
    /**
     * 总任务数
     */
    @Min(0)
    private int countTotal;
    
    /**
     * 已完成任务数
     */
    @Min(0)
    private int countFinished;
    
    /**
     * 已失败任务数
     */
    @Min(0)
    private int countFailed;
    
    /**
     * 批量任务的原始文件名
     */
    @NotNull
    private String sourceName;
    
    /**
     * 批量任务的原始文件内容.
     * 
     * Lazy load, 可能为空
     */
    private byte[] sourceContent;
    
}
