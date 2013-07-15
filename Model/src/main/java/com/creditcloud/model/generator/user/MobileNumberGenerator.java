/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.generator.user;

import com.creditcloud.model.generator.StringGenerator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author rooseek
 */
public class MobileNumberGenerator extends StringGenerator {

    private static final String[] head = {"130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "158", "159", "188", "189"};

    private static final int mod = 100000000;

    public MobileNumberGenerator(Random random) {
        super(random);
    }

    @Override
    public String[] generate(int number) {
        if (number < 1) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }

        Set<String> exist = new HashSet<String>();
        int i = 0;
        while (i < number) {
            int suffix = randomInt() % mod;
            String mobile = head[randomInt() % head.length].concat(Integer.toString(suffix));
            if (!exist.contains(mobile)) {
                exist.add(mobile);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
