/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.dao;

import com.creditcloud.common.validation.ValidatorWrapper;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.criteria.ParamInfo;
import com.creditcloud.model.criteria.ParamItem;
import com.creditcloud.model.criteria.SortInfo;
import com.creditcloud.model.criteria.SortItem;
import com.creditcloud.model.misc.PagedResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Validator;

/**
 * wrap read-only dao access methods
 *
 * @author rooseek
 */
public abstract class AbstractReadDAO<T> {

    @Resource
    protected Validator validator;

    protected Class<T> entityClass;

    public AbstractReadDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    protected ValidatorWrapper getValidatorWrapper() {
        return new ValidatorWrapper(validator);
    }

    /**
     * find entity by unique id
     *
     * @param id
     * @return
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public <K> T findBy(String fieldName, Object value, Class<K> valueClass) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> root = cq.from(entityClass);
        cq.select(root)
                .where(cb.equal(root.get(fieldName).as(valueClass), value));
        List<T> list = em.createQuery(cq).getResultList();
        return list.isEmpty() ? null : list.get(0);
    }

    /**
     * list all entity
     *
     * @return
     */
    public List<T> findAll() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

    /**
     * find entity in the range
     *
     * @param range
     * @return
     */
    public List<T> findRange(int[] range) {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     * count all entity
     *
     * @return
     */
    public int count() {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<T> rt = cq.from(entityClass);
        cq.select(cb.count(rt));
        Query q = em.createQuery(cq);
        Object result = q.getSingleResult();
        return result == null ? 0 : ((Long) result).intValue();
    }

    /**
     * list entity by CriteriaInfo
     *
     * @param criteriaInfo
     * @return PagedResult
     */
    public PagedResult<T> list(CriteriaInfo criteriaInfo) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(entityClass);
        Root<T> userRoot = cq.from(entityClass);
        cq.select(userRoot);
        ParamInfo paramInfo = criteriaInfo.getParamInfo();
        PageInfo pageInfo = criteriaInfo.getPageInfo();
        SortInfo sortInfo = criteriaInfo.getSortInfo();

        //build query for paramInfo
        if (paramInfo != null) {
            Set<Predicate> andCriteria = new HashSet();
            Set<Predicate> orCriteria = new HashSet();

            for (ParamItem item : paramInfo.getParamItems()) {
                Predicate predicate;
                if (item.getValue() instanceof String) {
                    //fuzy search for string
                    String regExp = "%" + item.getValue() + "%";
                    predicate = cb.like((Expression) (userRoot.get(item.getFieldName())), regExp);
                } else {
                    predicate = cb.equal((userRoot.get(item.getFieldName())), item.getValue());
                }

                switch (item.getOperator()) {
                    case AND:
                        andCriteria.add(predicate);
                        break;
                    case OR:
                        orCriteria.add(predicate);
                        break;
                }
            }
            if (orCriteria.size() > 0) {
                Predicate or = cb.or(orCriteria.toArray(new Predicate[orCriteria.size()]));
                andCriteria.add(or);
            }
            if (andCriteria.size() > 0) {
                Predicate and = cb.and(andCriteria.toArray(new Predicate[andCriteria.size()]));
                cq.where(and);
            }
        }

        //build query for sortInfo
        Set<Order> orderPredicate = new HashSet<>();
        if (sortInfo != null) {
            for (SortItem item : sortInfo.getSortItems()) {
                if (item.isDescending()) {
                    orderPredicate.add(cb.desc(userRoot.get(item.getFieldName())));
                } else {
                    orderPredicate.add(cb.asc(userRoot.get(item.getFieldName())));
                }
            }
        }
        if (orderPredicate.size() > 0) {
            cq.orderBy(orderPredicate.toArray(new Order[orderPredicate.size()]));
        }

        TypedQuery<T> query = em.createQuery(cq);
        //set result range
        if (pageInfo != null) {
            query.setFirstResult(pageInfo.getOffset());
            query.setMaxResults(pageInfo.getSize());
        }

        int totalSize;
        if (paramInfo != null
                && paramInfo.getParamItems().size() > 0) {
            totalSize = count(paramInfo);
        } else {
            totalSize = count();
        }

        return new PagedResult(query.getResultList(), totalSize);
    }

    /**
     * count entity by ParamInfo
     *
     * @param paramInfo
     * @return
     */
    public int count(ParamInfo paramInfo) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(entityClass);
        Root<T> userRoot = cq.from(entityClass);
        cq.select(cb.count(userRoot));

        //build query for paramInfo
        if (paramInfo != null) {
            Set<Predicate> andCriteria = new HashSet();
            Set<Predicate> orCriteria = new HashSet();

            for (ParamItem item : paramInfo.getParamItems()) {
                Predicate predicate;
                if (item.getValue() instanceof String) {
                    //fuzy search for string
                    String regExp = "%" + item.getValue() + "%";
                    predicate = cb.like((Expression) (userRoot.get(item.getFieldName())), regExp);
                } else {
                    predicate = cb.equal((userRoot.get(item.getFieldName())), item.getValue());
                }

                switch (item.getOperator()) {
                    case AND:
                        andCriteria.add(predicate);
                        break;
                    case OR:
                        orCriteria.add(predicate);
                        break;
                }
            }
            if (orCriteria.size() > 0) {
                Predicate or = cb.or(orCriteria.toArray(new Predicate[orCriteria.size()]));
                andCriteria.add(or);
            }
            if (andCriteria.size() > 0) {
                Predicate and = cb.and(andCriteria.toArray(new Predicate[andCriteria.size()]));
                cq.where(and);
            }
        }

        TypedQuery<Long> query = em.createQuery(cq);
        Long result = query.getSingleResult();
        return result == null ? 0 : result.intValue();
    }
}
