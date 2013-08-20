/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author rooseek
 */
public class FinanceInfo extends BaseObject {
    //是否有房
    private boolean house;

    private int houseNumber;

    //有无房贷
    private boolean houseLoan;

    //是否有车
    private boolean car;

    private int carNumber;

    //有无车贷
    private boolean carLoan;

    public FinanceInfo() {
    }

    /**
     *
     * @param house 是否有房
     * @param houseNumber 房产套数
     * @param houseLoan 有无房贷
     * @param car 是否有车
     * @param carNumber 车辆数目
     * @param carLoan 有无车贷
     */
    public FinanceInfo(boolean house,
                       int houseNumber,
                       boolean houseLoan,
                       boolean car,
                       int carNumber,
                       boolean carLoan) {
        this.house = house;
        this.houseNumber = houseNumber;
        this.houseLoan = houseLoan;
        this.car = car;
        this.carNumber = carNumber;
        this.carLoan = carLoan;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public void setHouseLoan(boolean houseLoan) {
        this.houseLoan = houseLoan;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public void setCarLoan(boolean carLoan) {
        this.carLoan = carLoan;
    }

    public boolean hasHouse() {
        return house;
    }

    public boolean hasHouseLoan() {
        return houseLoan;
    }

    public boolean hasCar() {
        return car;
    }

    public boolean hasCarLoan() {
        return carLoan;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
