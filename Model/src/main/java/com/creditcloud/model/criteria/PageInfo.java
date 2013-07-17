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

    /**
     * offset x means start from number (x + 1)
     */
    private final int offset;

    /**
     * number of pages
     */
    private final int pages;

    /**
     * page size
     */
    private final int size;

    public PageInfo(final int offset,
                    final int size) {
        this(offset, size, -1);
    }

    public PageInfo(final int offset,
                    final int size,
                    final int pages) {
        this.offset = offset;
        this.size = size;
        this.pages = pages;
    }

    public int getOffset() {
        return offset;
    }

    public int getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }
}
