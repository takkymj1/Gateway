/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.generator;

import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author rooseek
 */
public abstract class StringGenerator implements Generator<String> {

    protected Random random;

    public StringGenerator(Random random) {
        this.random = random;
    }

    @Override
    public String[] generate(int number) {
        return ArrayUtils.EMPTY_STRING_ARRAY;
    }

    protected int randomInt() {
        return Math.abs(random.nextInt());
    }
}
