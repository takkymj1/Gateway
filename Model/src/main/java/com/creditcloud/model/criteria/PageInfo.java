/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

/**
 *
 * @author sobranie
 */
public class PageInfo {

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
