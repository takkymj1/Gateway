/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.RewardType;
import com.creditcloud.model.misc.Reward;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rooseek
 */
public class RewardTest {

    public RewardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calculateReward method, of class Reward.
     */
    @Test
    public void testCalculateReward() {
        Reward reward = null;
        BigDecimal amount = null;
        BigDecimal expectedAmount = BigDecimal.ZERO;
        assertEquals(null, expectedAmount, Reward.calculateReward(reward, amount));

        reward = new Reward(RewardType.FIXED, BigDecimal.ONE, new BigDecimal("0.1"));
        expectedAmount = BigDecimal.ONE;
        amount = BigDecimal.TEN;
        assertEquals(null, expectedAmount, Reward.calculateReward(reward, amount));

        reward.setType(RewardType.FLOATING);
        assertEquals(null, expectedAmount, Reward.calculateReward(reward, amount).stripTrailingZeros());

        reward.setType(RewardType.NONE);
        expectedAmount = BigDecimal.ZERO;
        assertEquals(null, expectedAmount, Reward.calculateReward(reward, amount).stripTrailingZeros());
        
        reward.setType(RewardType.BOTH);
        expectedAmount = new BigDecimal(2);
        assertEquals(null, expectedAmount, Reward.calculateReward(reward, amount).stripTrailingZeros());
    }
}
