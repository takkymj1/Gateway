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
        return add(fieldName, value, ParamOperator.AND);
    }

    public ParamInfo add(final String fieldName,
                         final Object value,
                         final ParamOperator operator) {
        paramItems.add(new ParamItem(fieldName, value, operator));
        return this;
    }

    public Set<ParamItem> getParamItems() {
        return paramItems;
    }

    public class ParamItem extends BaseObject {

        private final ParamOperator operator;

        private final String fieldName;

        private final Object value;

        private ParamItem(final String fieldName,
                          final Object value) {
            this(fieldName, value, ParamOperator.AND);
        }

        private ParamItem(final String fieldName,
                          final Object value,
                          final ParamOperator operator) {
            this.fieldName = fieldName;
            this.value = value;
            this.operator = operator;
        }

        public String getFieldName() {
            return fieldName;
        }

        public Object getValue() {
            return value;
        }

        public ParamOperator getOperator() {
            return operator;
        }
    }
}
