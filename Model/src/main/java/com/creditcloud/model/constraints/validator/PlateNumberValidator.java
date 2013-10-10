/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.validator;

import com.creditcloud.model.constraints.PlateNumber;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author rooseek
 */
public class PlateNumberValidator implements ConstraintValidator<PlateNumber, String> {

    private static final String[] prefix = new String[]{"京",
                                                        "沪",
                                                        "津",
                                                        "渝",
                                                        "冀",
                                                        "晋",
                                                        "蒙",
                                                        "辽",
                                                        "吉",
                                                        "黑",
                                                        "苏",
                                                        "浙",
                                                        "皖",
                                                        "闽",
                                                        "赣",
                                                        "鲁",
                                                        "豫",
                                                        "鄂",
                                                        "湘",
                                                        "粤",
                                                        "桂",
                                                        "琼",
                                                        "川",
                                                        "贵",
                                                        "云",
                                                        "藏",
                                                        "陕",
                                                        "甘",
                                                        "青",
                                                        "宁",
                                                        "新",};

    private static final Set<String> prefixSet = new HashSet(Arrays.asList(prefix));

    /**
     * 京V的车牌排除出去
     */
    private static final Set<String> excludedPrefix = new HashSet(Arrays.asList("京V"));

    private static final Pattern suffixPattern = Pattern.compile("[A-Z]{1}[A-Z0-9]{4}");

    private PlateNumber constraintAnnotation;

    @Override
    public void initialize(PlateNumber constraintAnnotation) {
        this.constraintAnnotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        if (value.length() != 6) {
            return false;
        }
        String temp = value.substring(0, 2);
        if (excludedPrefix.contains(temp)) {
            return false;
        }
        
        temp = value.substring(0, 1);
        if (!prefixSet.contains(temp)) {
            return false;
        }
        temp = value.substring(1);
        Matcher matcher = suffixPattern.matcher(temp);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }
}
