/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class FinanceInfo extends BaseObject{
    //是否有房

    @FormParam("house")
    @XmlElement(name = "house")
    private boolean house;

    @FormParam("houseNumber")
    @XmlElement(name = "houseNumber")
    private int houseNumber;

    //有无房贷
    @FormParam("houseLoan")
    @XmlElement(name = "houseLoan")
    private boolean houseLoan;

    //是否有车
    @FormParam("car")
    @XmlElement(name = "car")
    private boolean car;

    @FormParam("carNumber")
    @XmlElement(name = "carNumber")
    private int carNumber;

    //有无车贷
    @FormParam("carLoan")
    @XmlElement(name = "carLoan")
    private boolean carLoan;

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

    public FinanceInfo() {
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

    public void setHouse(boolean house) {
        this.house = house;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setHouseLoan(boolean houseLoan) {
        this.houseLoan = houseLoan;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setCarLoan(boolean carLoan) {
        this.carLoan = carLoan;
    }
}
