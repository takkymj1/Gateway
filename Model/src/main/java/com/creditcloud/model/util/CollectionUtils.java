/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import java.util.Collection;
import java.util.Random;

/**
 *
 * @author rooseek
 */
public class CollectionUtils {
    
    private static final Random random = new Random();

    /**
     * get random elements from a collection
     *
     * @param <T>
     * @param elements
     * @return
     */
    public static <T> T getRandomElement(Collection<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException(" collection must have element!");
        }
        random.setSeed(System.currentTimeMillis());
        int offset = random.nextInt() % elements.size();
        for (T element : elements) {
            if (offset == 0) {
                return element;
            }
            offset--;
        }
        
        return null;
    }
}
