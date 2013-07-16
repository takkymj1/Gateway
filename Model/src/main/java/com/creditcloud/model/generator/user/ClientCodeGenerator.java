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
public class ClientCodeGenerator extends StringGenerator {

    private final static char[] upperChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public ClientCodeGenerator(Random random) {
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
            char first = upperChar[randomInt() % upperChar.length];
            char second = upperChar[randomInt() % upperChar.length];
            char third = upperChar[randomInt() % upperChar.length];
            char fourth = upperChar[randomInt() % upperChar.length];
            String code = new String(new char[]{first, second, third, fourth});
            if (!exist.contains(code)) {
                exist.add(code);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
    }
}
