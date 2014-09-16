/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.CertificateScore;
import com.creditcloud.config.CertificateScoreConfig;
import com.creditcloud.model.enums.user.credit.CreditRank;

/**
 *
 * @author rooseek
 */
public class CertificateUtils {

    /**
     * get rank from score
     *
     * @param score
     * @param scoreConfig
     * @return
     */
    public static CreditRank scoreToRank(int score, CertificateScoreConfig scoreConfig) {
        if (scoreConfig == null) {
            return null;
        }

        if (scoreConfig.getScores().length == 0) {
            return null;
        }

        for (CertificateScore certificateScore : scoreConfig.getScores()) {
            if (score >= certificateScore.getMinScore() && score <= certificateScore.getMaxScore()) {
                return certificateScore.getRank();
            }
        }

        return null;
    }
}
