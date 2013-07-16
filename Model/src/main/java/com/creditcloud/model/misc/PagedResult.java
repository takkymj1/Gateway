/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import java.util.List;

/**
 *
 * @author sobranie
 */
public class PagedResult<T> extends BaseObject{

    private final List<T> results;

    private final int totalSize;

    public PagedResult(final List<T> results,
                       final int totalSize) {
        this.results = results;
        this.totalSize = totalSize;
    }
    
    public List<T> getResults() {
        return results;
    }

    public int getTotalSize() {
        return totalSize;
    }
}
