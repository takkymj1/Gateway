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
public class RealNameGenerator extends StringGenerator {

    private static final char[] chars;

    private static final int upper = 0x9fb9;

    private static final int lower = 0x4e00;

    static {
        chars = new char[upper - lower];
        for (int i = lower; i < upper; i++) {
            chars[i - lower] = (char) i;
        }
    }

    public RealNameGenerator(Random random) {
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
            String name = new String(new char[]{first, second, third});
            if (!exist.contains(name)) {
                exist.add(name);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
