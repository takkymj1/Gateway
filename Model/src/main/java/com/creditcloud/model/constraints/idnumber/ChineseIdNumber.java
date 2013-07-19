/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.idnumber;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.util.Regions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>
 * a simple port to check consistence between user register information with
 * idnumber
 * </p>
 *
 * @author rooseek
 */
public class ChineseIdNumber extends BaseObject{

    private final static Map<String, String> code2Province = new HashMap<String, String>() {
        {
            this.put("11", "北京");
            this.put("12", "天津");
            this.put("13", "河北");
            this.put("14", "山西");
            this.put("15", "内蒙古");
            this.put("21", "辽宁");
            this.put("22", "吉林");
            this.put("23", "黑龙江");
            this.put("31", "上海");
            this.put("32", "江苏");
            this.put("33", "浙江");
            this.put("34", "安徽");
            this.put("35", "福建");
            this.put("36", "江西");
            this.put("37", "山东");
            this.put("41", "河南");
            this.put("42", "湖北");
            this.put("43", "湖南");
            this.put("44", "广东");
            this.put("45", "广西");
            this.put("46", "海南");
            this.put("50", "重庆");
            this.put("51", "四川");
            this.put("52", "贵州");
            this.put("53", "云南");
            this.put("54", "西藏");
            this.put("61", "陕西");
            this.put("62", "甘肃");
            this.put("63", "青海");
            this.put("64", "宁夏");
            this.put("65", "新疆");
            this.put("71", "台湾");
            this.put("81", "香港");
            this.put("82", "澳门");
            this.put("91", "国外");
        }
    };

    private final String idNumber;

    private final String province;

    private final String city;

    private final String county;

    private final int year;

    private final int month;

    private final int day;

    private final boolean male;

    private static final ChineseIdNumberValidator validator = new ChineseIdNumberValidator();

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    private ChineseIdNumber(String idNumber, String province, String city, String county, int year, int month, int day, boolean male) {
        this.idNumber = idNumber;
        this.province = province;
        this.city = city;
        this.county = county;
        this.year = year;
        this.month = month;
        this.day = day;
        this.male = male;
    }

    /**
     * factory method to retrieve ChineseIdNumber from idNumber string
     *
     * @param idNumber
     * @return
     */
    public static ChineseIdNumber create(String idNumber) {
        if (validator.isValid(idNumber)) {
            try {
                String province = idNumber.substring(0, 2);
                String provinceName = code2Province.get(province);
                String city = idNumber.substring(0, 4);
                String cityName = getRegionName(province, city);
                String county = idNumber.substring(0, 6);
                String countyName = getRegionName(city, county);
                Date birthDate = null;
                boolean male = false;
                if (idNumber.length() == 18) {
                    male = Integer.parseInt(idNumber.substring(16, 17)) % 2 == 0 ? false : true;
                    birthDate = new SimpleDateFormat("yyyyMMdd").parse(idNumber.substring(6, 14));
                } else if (idNumber.length() == 15) {
                    male = Integer.parseInt(idNumber.substring(14, 15)) % 2 == 0 ? false : true;
                    birthDate = new SimpleDateFormat("yyMMdd").parse(idNumber.substring(6, 12));
                }
                calendar.setTime(birthDate);
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH) + 1;
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                return new ChineseIdNumber(idNumber, provinceName, cityName, countyName, year, month, day, male);
            } catch (ParseException ex) {
                Logger.getLogger(ChineseIdNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public String getProvince() {
        return province;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean isMale() {
        return male;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }
   

    private static String getRegionName(String parentCode, String childCode) {
        List<Regions.Entry> regions = Regions.getRegionList(parentCode);
        if (regions != null) {
            for (Regions.Entry entry : regions) {
                if (entry.getCode().equals(childCode)) {
                    return entry.getRegion();
                }
            }
        }

        return null;
    }
}