/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

/**
 *
 * @author sobranie
 */
public interface Jsonizable<T> {

    /**
     * 将自身转化为JsonString表示的对象
     * 
     * @param jsonString
     * @return 
     */
    T fromJsonString(String jsonString);
    
    /**
     * 序列化成一个标准的JsonString
     * 
     * @return 
     */
    String toJsonString();
}
