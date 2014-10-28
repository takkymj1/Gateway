/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author suetming
 */
public interface CacheConstant {
    
    /**
     * define cache key for inner cache
     */
    String KEY_PREFIX_INNER_RESOURCE = "%1$s_%2$s";
    
    /**
     * define cache key for inner cache
     */
    String KEY_PREFIX_INNER_RESOURCE_WITH_ID = "%1$s_%2$s_%3$s";
}
