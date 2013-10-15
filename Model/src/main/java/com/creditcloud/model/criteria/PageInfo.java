/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author sobranie
 */
public class PageInfo extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    /**
     * 获取全部内容
     */
    public static final PageInfo ALL = new PageInfo(0, Integer.MAX_VALUE);

    /**
     * offset x means start from number (x + 1)
     */
    private final int offset;

    /**
     * page size
     */
    private final int size;

    public PageInfo(final int offset,
                    final int size) {
        this.offset = offset;
        this.size = size;
    }

    public int getOffset() {
        return offset;
    }

    public int getSize() {
        return size;
    }
}
