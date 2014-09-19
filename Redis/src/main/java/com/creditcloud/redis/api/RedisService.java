/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.redis.api;

import javax.ejb.Remote;

/**
 *
 * @author suetming
 */
@Remote
public interface RedisService {

    public void put(String clientCode, String key, String value);

    /**
     *
     * @param clientCode
     * @param key
     * @param value
     * @param clazz 当前所在类（避免相同键值对导致混淆）
     */
    public void put(String clientCode, String key, String value, Class clazz);

    public void put(String clientCode, String key, Object object);

    public void put(String clientCode, String key, Integer value);

    public String getString(String clientCode, String key);

    /**
     *
     * @param clientCode
     * @param key
     * @param clazz 当前所在类（避免相同键值对导致混淆）
     * @return
     */
    public String getString(String clientCode, String key, Class clazz);

    /**
     *
     * @param <T>
     * @param clientCode
     * @param key
     * @param classOfT
     * @return
     */
    public <T> T get(String clientCode, String key, Class<T> classOfT);

    public Integer getInteger(String clientCode, String key);

    public boolean exist(String clientCode, String key);
}
