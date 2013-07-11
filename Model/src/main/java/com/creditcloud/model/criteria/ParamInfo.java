/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import com.creditcloud.model.BaseObject;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sobranie
 */
public final class ParamInfo extends BaseObject {

    private final Set<ParamItem> paramItems;

    public ParamInfo() {
        paramItems = new HashSet<>();
    }

    public ParamInfo(final String fieldName,
                     final Object value) {
        this();
        add(fieldName, value);
    }

    public ParamInfo add(final String fieldName,
                         final Object value) {
        paramItems.add(new ParamItem(fieldName, value));
        return this;
    }

    public Set<ParamItem> getParamItems() {
        return paramItems;
    }

    public class ParamItem {

        private final String fieldName;

        private final Object value;

        private ParamItem(final String fieldName,
                          final Object value) {
            this.fieldName = fieldName;
            this.value = value;
        }

        public String getFieldName() {
            return fieldName;
        }

        public Object getValue() {
            return value;
        }
    }
}
