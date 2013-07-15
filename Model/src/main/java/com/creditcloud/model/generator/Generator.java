/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.generator;

/**
 *
 * TODO All Generator subclasses are created only for test purpose, will be
 * removed soon
 *
 * @author rooseek
 */
interface Generator<T> {

    /**
     * Generate unique random items satisfying constraints
     *
     * @param number is the count of items to be generated
     * @return
     */
    T[] generate(int number);
}
