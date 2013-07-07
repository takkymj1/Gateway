/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sobranie
 */
public final class ParamInfo {

    private final Set<ParamItem> paramItems;

    public ParamInfo(final String fieldName,
                     final Object value) {
        paramItems = new HashSet<>();
        add(fieldName, value);
    }

    public ParamInfo add(final String fieldName,
                         final Object value) {
        paramItems.add(new ParamItem(fieldName, value));
        return this;
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
