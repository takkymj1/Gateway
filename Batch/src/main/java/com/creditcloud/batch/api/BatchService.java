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
import com.creditcloud.model.misc.RealmEntity;
import java.util.concurrent.Future;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface BatchService extends BatchQueryService {

    /**
     * 创建/提交一个批量任务.
     *
     * 只是在系统中记录下来，并不会执行
     *
     * @param clientCode
     * @param submitter
     * @param type
     * @param name 任务名称，不可为空
     * @param fileName
     * @param fileContent
     * @return null 如果没有创建成功
     */
    BatchJob createBatchJob(String clientCode, RealmEntity submitter, BatchJobType type, String name, String fileName, byte[] fileContent);

    /**
     * 触发执行一个批量任务.
     * 
     * 为异步调用，调用者可以选择等待或者并行
     *
     * @param clientCode
     * @param executor
     * @param batchId
     * @param threads 使用多大的线程池来执行
     * @return
     */
    Future<BatchJobStatus> executeBatchJob(String clientCode, RealmEntity executor, String batchId, int threads);

    /**
     * 取消一个批量任务的执行.
     *
     * @param clientCode
     * @param executor
     * @param batchId
     * @return
     */
    boolean cancelBatchJob(String clientCode, RealmEntity executor, String batchId);
    
    /**
     * 更新Task信息
     * 
     * @param clientCode
     * @param task
     * @return 
     */
    void updateTask(String clientCode, Task task);
    
    
    /**
     * 更新Job信息
     * 
     * @param clientCode
     * @param job 
     */
    void updateJob(String clientCode, BatchJob job);

}
