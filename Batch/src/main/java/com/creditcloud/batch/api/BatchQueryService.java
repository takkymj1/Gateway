/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.api;

import com.creditcloud.batch.model.BatchJob;
import com.creditcloud.batch.model.BatchJobStatus;
import com.creditcloud.batch.model.BatchJobType;
import com.creditcloud.batch.model.Task;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface BatchQueryService {
    
    /**
     * 获取某个批量任务的详情.
     * 
     * 不读取原始文件内容
     * 
     * @param clientCode
     * @param id
     * @return 
     */
    BatchJob getBatchJobById(String clientCode, String id);
    
    /**
     * 获取某批量任务的原始文件内容
     * 
     * @param clientCode
     * @param id
     * @return 
     */
    byte[] getBatchJobSource(String clientCode, String id);
    
    /**
     * 获取某批量任务的子任务列表.
     * 
     * 默认按照 Task.ordinal 正排序
     * 
     * @param clientCode
     * @param id
     * @param pageInfo
     * @return 
     */
    PagedResult<Task> getBatchJobTasks(String clientCode, String id, PageInfo pageInfo);
    
    /**
     * 分页列出特定种类的批量任务
     * 
     * @param clientCode
     * @param type
     * @param pageInfo
     * @param status null则返回所有状态的BatchJob
     * @return 
     */
    PagedResult<BatchJob> listBatchJobsByType(String clientCode, BatchJobType type, PageInfo pageInfo, BatchJobStatus... status);
    
}
