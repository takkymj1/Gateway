/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import com.creditcloud.interestbearing.ta.model.ProductFundRegistrationMetadata;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author GuohuaZhang
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCloudTAConfig extends ConfigObjBase {

    /**
     * 平台在云信TA的租户账号
     */
    private String tenantId;

    private String name;
    private String desc;
    private String url;

    private List<ProductFundRegistrationMetadata> registeredProducts;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }

    /**
     * 增加已经注册到TA的基金到配置(如果已经添加到配置，则不添加)
     *
     * @param product
     */
    public void addRegisteredProduct(ProductFundRegistrationMetadata product) {
        if (product == null || product.getProduct() == null) {
            return;
        }

        if (registeredProducts == null) {
            registeredProducts = new ArrayList<>();
        }

        if (!isProductAlreadyRegistered(product)) {
            registeredProducts.add(product);
        }
    }

    /**
     * 增加已经注册到TA的基金到配置(如果已经添加到配置，则替换)
     *
     * @param product
     */
    public void addOrReplaceRegisteredProduct(ProductFundRegistrationMetadata product) {
        if (product == null || product.getProduct() == null) {
            return;
        }

        if (registeredProducts == null) {
            registeredProducts = new ArrayList<>();
        }

        for (ProductFundRegistrationMetadata r : registeredProducts) {
            if (product.getProduct().isOfSameProduct(r.getProduct())) {
                {
                    registeredProducts.remove(r);
                    break;
                }
            }
        }

        registeredProducts.add(product);
    }

    public boolean isProductAlreadyRegistered(ProductFundRegistrationMetadata product) {
        if (registeredProducts == null) {
            return false;
        }

        if (product == null || product.getProduct() == null) {
            return false;
        }

        for (ProductFundRegistrationMetadata r : registeredProducts) {
            if (product.getProduct().isOfSameProduct(r.getProduct())) {
                return true;
            }
        }

        return false;
    }

    public boolean isProductAlreadyRegistered(String brokerName, String fundId) {
        if (registeredProducts == null) {
            return false;
        }

        if (brokerName == null || fundId == null) {
            return false;
        }

        for (ProductFundRegistrationMetadata r : registeredProducts) {
            if (r.getProduct() == null) {
                continue;
            }
            
            if (r.getProduct().isOfSameProduct(brokerName, fundId)) {
                return true;
            }
        }

        return false;
    }

}
