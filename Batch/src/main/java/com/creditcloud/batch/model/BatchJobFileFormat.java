/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

/**
 * BatchJob文件格式有关常量
 *  
 * @author sobranie
 */
public interface BatchJobFileFormat {
    
    /**
     * 能处理的最大行数
     */
    int MAX_LINES = 500;

    /**
     * 注释用字符，放在开始注释一行
     */
    String COMMENT = "#";
    
    /**
     * 区分各列的符号
     */
    String DELIMITER = "\\|";
    
    /**
     * 批量生成用户的用户名前缀
     */
    String USER_LOGINNAME_PREFIX = "batch_";
}
