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
public class LoginNameGenerator extends StringGenerator {

    private final static char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                                                   'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                                   '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public LoginNameGenerator(Random random) {
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
            char fifth = chars[randomInt() % chars.length];
            char sixth = chars[randomInt() % chars.length];
            char seventh = chars[randomInt() % chars.length];
            char eighth = chars[randomInt() % chars.length];
            String name = new String(new char[]{first, second, third, fourth, fifth, sixth, seventh, eighth});
            if (!exist.contains(name)) {
                exist.add(name);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
