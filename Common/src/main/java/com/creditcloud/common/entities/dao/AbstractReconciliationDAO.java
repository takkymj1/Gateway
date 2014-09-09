/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.dao;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * abstract reconciliation DAO from third party payment
 *
 * @author rooseek
 */
public abstract class AbstractReconciliationDAO<T> extends AbstractDAO<T> {

    public AbstractReconciliationDAO(Class<T> entityClass) {
        super(entityClass);
    }

    /**
     * add reconciliation
     *
     * @param reconciliation
     */
    public abstract void add(T reconciliation);

    /**
     * add list of reconciliations
     *
     * @param reconciliations
     */
    public abstract void addAll(List<T> reconciliations);

    /**
     * update reconciliation
     *
     * @param reconciliation
     */
    public abstract void update(T reconciliation);

    /**
     * get reconciliation by order id
     *
     * @param orderId
     * @return
     */
    public abstract T getByOrderId(String orderId);

    /**
     * list reconciliations between from date and to date
     *
     * @param from
     * @param to
     * @param pageInfo
     * @return
     */
    public abstract PagedResult<T> listByOrderDate(LocalDate from, LocalDate to, PageInfo pageInfo);

    /**
     * count reconciliations between from date and to date
     *
     * @param from
     * @param to
     * @return
     */
    public abstract int countByOrderDate(LocalDate from, LocalDate to);

}
