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
public class UrlGenerator extends StringGenerator {

    public final static String[] prefix = {"www"};

    public final static String[] suffix = {"com", "cn", "com.cn"};

    private final static char[] chars = new char[]{
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};

    public UrlGenerator(Random random) {
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
            char first = chars[randomInt() % chars.length];
            char second = chars[randomInt() % chars.length];
            char third = chars[randomInt() % chars.length];
            char fourth = chars[randomInt() % chars.length];
            String name = new String(new char[]{first, second, third, fourth}).concat(".").concat(suffix[randomInt() % suffix.length]);
            name = prefix[randomInt() % prefix.length].concat(name);
            if (!exist.contains(name)) {
                exist.add(name);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
