/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.criteria;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author rooseek
 */
public class ParamItem extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    private final ParamOperator operator;

    private final String fieldName;

    private final Object value;
    
    private final QueryOperator queryOperator;

    public ParamItem(final String fieldName,
                      final Object value) {
        this(fieldName, value, ParamOperator.AND);
    }

    public ParamItem(final String fieldName,
                      final Object value,
                      final ParamOperator operator) {
        this(fieldName,value,operator,null);
    }
    
    public ParamItem(final String fieldName,
                      final Object value,
                      final ParamOperator operator,
                      final QueryOperator queryOperator) {
        this.fieldName = fieldName;
        this.value = value;
        this.operator = operator;
        this.queryOperator = queryOperator;
    }
    
    public QueryOperator getQueryOperator(){
        return queryOperator;
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
