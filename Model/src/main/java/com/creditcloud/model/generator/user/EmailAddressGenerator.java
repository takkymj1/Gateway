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
public class EmailAddressGenerator extends StringGenerator {

    private final static String[] host = new String[]{"gmail.com", "sina.com", "163.com", "sohu.com", "creditcloud.com", "sohu.com", "qq.com"};

    private final static char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                                   '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public EmailAddressGenerator(Random random) {
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
            String email = new String(new char[]{first, second, third, fourth, fifth, sixth})
                    .concat("@")
                    .concat(host[randomInt() % host.length]);
            if (!exist.contains(email)) {
                exist.add(email);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
