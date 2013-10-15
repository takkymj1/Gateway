/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import com.creditcloud.model.BaseObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sobranie
 */
public final class SortInfo extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    private final List<SortItem> sortItems;

    public SortInfo() {
        sortItems = new ArrayList<>();
    }

    public SortInfo(String fieldName) {
        this(fieldName, false);
    }

    public SortInfo(String fieldName, boolean descending) {
        this();
        add(fieldName, descending);
    }

    public List<SortItem> getSortItems() {
        return sortItems;
    }

    /**
     * Accumulate next sort criteria
     *
     * @param fieldName
     * @return
     */
    public SortInfo by(String fieldName) {
        return by(fieldName, false);
    }

    /**
     * Accumulate next sort criteria
     *
     * @param fieldName
     * @param descending
     * @return
     */
    public SortInfo by(String fieldName, boolean descending) {
        add(fieldName, descending);
        return this;
    }

    private void add(String fieldName, boolean descending) {
        sortItems.add(new SortItem(fieldName, descending));
    }
}
