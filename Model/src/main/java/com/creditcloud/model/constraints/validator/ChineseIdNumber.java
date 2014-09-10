/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.validator;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.IdNumberConstant;
import com.creditcloud.model.util.Regions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * a simple port to check consistence between user register information with
 * idnumber
 * </p>
 *
 * @author rooseek
 */
public class ChineseIdNumber extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    private final static Map<String, String> code2Province = new HashMap();

    private final static Map<String, String> code2City = new HashMap();

    private final static Map<String, String> code2County = new HashMap();

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    static {
        for (Entry<String, String> entry : Regions.getRegionMap().entrySet()) {
            String code = entry.getKey();
            String region = entry.getValue();
            if (code.substring(2, 6).equals(IdNumberConstant.PROVINCE_SUFFIX)) {
                //province
                code2Province.put(code.substring(0, 2), region);
            } else if (code.substring(4, 6).equals(IdNumberConstant.CITY_SUFFIX)) {
                //city
                code2City.put(code.substring(0, 4), region);
            } else {
                //county
                code2County.put(code.substring(0, 6), region);
            }
        }
    }

    private final String idNumber;

    private final String province;

    private final String city;

    private final String county;

    private final int year;

    private final int month;

    private final int day;

    private final boolean male;

    private static final ChineseIdNumberValidator validator = new ChineseIdNumberValidator();

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
                String province = getProvince(idNumber.substring(0, 2));
                String city = getCity(idNumber.substring(0, 4));
                String county = getCounty(idNumber.substring(0, 6));
                Date birthDate = null;
                boolean male = false;
                if (idNumber.length() == 18) {
                    male = Integer.parseInt(idNumber.substring(16, 17)) % 2 != 0;
                    birthDate = new SimpleDateFormat("yyyyMMdd").parse(idNumber.substring(6, 14));
                } else if (idNumber.length() == 15) {
                    male = Integer.parseInt(idNumber.substring(14, 15)) % 2 != 0;
                    birthDate = new SimpleDateFormat("yyMMdd").parse(idNumber.substring(6, 12));
                }
                calendar.setTime(birthDate);
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH) + 1;
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                return new ChineseIdNumber(idNumber,
                                           province,
                                           city,
                                           county,
                                           year,
                                           month,
                                           day,
                                           male);
            } catch (ParseException ex) {
                Logger.getLogger(ChineseIdNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    /**
     * 判断身份证号对应的性别
     *
     * @param idNumber
     * @return
     */
    @SuppressWarnings("checked")
    public static boolean isMale(String idNumber) {
        if (!isValid(idNumber)) {
            throw new IllegalArgumentException(String.format("invalid idNumber %s", idNumber));
        }
        String male = StringUtils.substring(idNumber, 16, 17);
        int maleInt = Integer.valueOf(male);
        return maleInt % 2 != 0;
    }

    /**
     * 从身份证中获得出生日期
     *
     * @param idNumber
     * @return
     */
    public static Date getDateOfBirth(String idNumber) {
        if (!isValid(idNumber)) {
            throw new IllegalArgumentException(String.format("invalid idNumber %s", idNumber));
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date day = null;
        try {
            day = sdf.parse(StringUtils.substring(idNumber, 6, 14));
        } catch (ParseException ex) {
            Logger.getLogger(ChineseIdNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
        return day;
    }

    public static boolean isValid(String idNumber) {
        return validator.isValid(idNumber);
    }

    private static String getProvince(String code) {
        return code2Province.get(code);
    }

    private static String getCity(String code) {
        return code2City.get(code);
    }

    private static String getCounty(String code) {
        return code2County.get(code);
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
}
