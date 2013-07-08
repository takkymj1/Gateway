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
public class CriteriaInfo extends BaseObject {

    private final ParamInfo paramInfo;

    private final PageInfo pageInfo;

    private final SortInfo sortInfo;

    public CriteriaInfo(final ParamInfo paramInfo,
                        final PageInfo pageInfo,
                        final SortInfo sortInfo) {
        this.paramInfo = paramInfo;
        this.pageInfo = pageInfo;
        this.sortInfo = sortInfo;
    }

    public ParamInfo getParamInfo() {
        return paramInfo;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public SortInfo getSortInfo() {
        return sortInfo;
    }
}
