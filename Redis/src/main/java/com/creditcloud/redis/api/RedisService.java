/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.redis.api;

import com.creditcloud.model.client.Client;
import javax.ejb.Remote;

/**
 *
 * @author suetming
 */
@Remote
public interface RedisService {
    
    public void put(Client client, String key, String value);
    
    /**
     * 
     * @param key
     * @param value
     * @param clazz 当前所在类（避免相同键值对导致混淆）
     */
    public void put(Client client, String key, String value, Class clazz);
            
    public void put(Client client, String key, Object object);
    
    public void put(Client client, String key, Integer value);
    
    public String getString(Client client, String key);
    
    /**
     * 
     * @param key
     * @param clazz 当前所在类（避免相同键值对导致混淆） 
     * @return 
     */
    public String getString(Client client, String key, Class clazz);
    
    /**
     * 
     * @param <T>
     * @param key
     * @param classOfT
     * @return 
     */
    public <T> T get(Client client, String key, Class<T> classOfT);
    
    public Integer getInteger(Client client, String key);
    
    public boolean exist(Client client, String key);
}
