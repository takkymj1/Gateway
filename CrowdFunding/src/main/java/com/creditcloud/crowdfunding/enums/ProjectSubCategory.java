/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProjectSubCategory implements BaseEnum {

    A_B("A_B", ProjectCategory.A);

    private final String key;

    private final ProjectCategory category;

    private ProjectSubCategory(String key, ProjectCategory category) {
        this.key = key;
        this.category = category;
    }

    @Override
    public String getKey() {
        return key;
    }

    public ProjectCategory getCategory() {
        return category;
    }
}
