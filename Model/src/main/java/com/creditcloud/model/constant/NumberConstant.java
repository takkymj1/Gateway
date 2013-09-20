/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author sobranie
 */
public interface NumberConstant {

    int DEFAULT_SCALE = 2;

    MathContext DEFAULT_MATHCONTEXT = MathContext.DECIMAL64;

    BigDecimal ZERO = new BigDecimal(BigInteger.ZERO, DEFAULT_SCALE, DEFAULT_MATHCONTEXT);
}
