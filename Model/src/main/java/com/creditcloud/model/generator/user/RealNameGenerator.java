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

    static {
        chars = new char[0x9fb9 - 0x4e00];
        for (int i = 0x4e00; i < 0x9fb9; i++) {
            chars[i - 0x4e00] = (char) i;
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
            String name = new String(new char[]{first, second});
            if (!exist.contains(name)) {
                exist.add(name);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
