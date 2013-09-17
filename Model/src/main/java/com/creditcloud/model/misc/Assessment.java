/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Assessment extends BaseObject{

    @NotNull
    private int score;

    public Assessment(int score) {
        this.score = score;
    }

    public Assessment() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
