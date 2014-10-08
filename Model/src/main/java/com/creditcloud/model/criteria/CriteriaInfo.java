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

    private static final long serialVersionUID = 20131015L;

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

    /**
     * validate incoming ParamInfo for sql query
     *
     * @param info
     * @return
     */
    public static boolean validate(CriteriaInfo info) {
        if (!validate(info.getParamInfo())) {
            return false;
        }
        if (!validate(info.getSortInfo())) {
            return false;
        }
        return validate(info.getPageInfo());
    }

    public static boolean validate(ParamInfo paramInfo) {
        //TODO
        return true;
    }

    public static boolean validate(SortInfo sortInfo) {
        //TODO
        return true;
    }

    public static boolean validate(PageInfo pageInfo) {
        //TODO 
        return true;
    }
}
