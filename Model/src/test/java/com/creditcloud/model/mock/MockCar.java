/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.mock;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.PlateNumber;

/**
 *
 * @author rooseek
 */
public class MockCar extends BaseObject{
    @PlateNumber
    private String plateNumber;

    public MockCar() {
    }

    public MockCar(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    
}
