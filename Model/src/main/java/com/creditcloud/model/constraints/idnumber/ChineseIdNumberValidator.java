/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints.idnumber;

import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constant.IdNumberConstant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * <p>
 * 判断18位身份证的合法性
 * </p>
 * 根据〖中华人民共和国国家标准GB11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。
 * 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
 * <p>
 * 顺序码: 表示在同一地址码所标识的区域范围内，对同年、同月、同 日出生的人编定的顺序号，顺序码的奇数分配给男性，偶数分配 给女性。
 * </p>
 * <p>
 * 1.前1、2位数字表示：所在省份的代码； 2.第3、4位数字表示：所在城市的代码； 3.第5、6位数字表示：所在区县的代码；
 * 4.第7~14位数字表示：出生年、月、日； 5.第15、16位数字表示：所在地的派出所的代码； 6.第17位数字表示性别：奇数表示男性，偶数表示女性；
 * 7.第18位数字是校检码：也有的说是个人信息码，一般是随计算机的随机产生，用来检验身份证的正确性。校检码可以是0~9的数字，有时也用x表示。
 * </p>
 * <p>
 * 第十八位数字(校验码)的计算方法为： 1.将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7 9 10 5 8 4 2 1
 * 6 3 7 9 10 5 8 4 2
 * </p>
 * <p>
 * 2.将这17位数字和系数相乘的结果相加。
 * </p>
 * <p>
 * 3.用加出来和除以11，看余数是多少？
 * </p>
 * 4.余数只可能有0 1 2 3 4 5 6 7 8 9 10这11个数字。其分别对应的最后一位身份证的号码为1 0 X 9 8 7 6 5 4 3 2。
 * <p>
 * 5.通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。
 * </p>
 *
 * <p>
 * 对于15位身份证,不需要判断最后一位验证码,最后一位代表性别，奇数表示男性，偶数表示女性 默认使用18位身份证号，15位暂不支持
 * </p>
 *
 * @author rooseek
 *
 *
 */
public class ChineseIdNumberValidator implements IdNumberValidator {

    private IdNumber idNumber;

    private static final String provinceCode[][] = {{"11", "北京"}, {"12", "天津"},
                                                    {"13", "河北"}, {"14", "山西"}, {"15", "内蒙古"}, {"21", "辽宁"},
                                                    {"22", "吉林"}, {"23", "黑龙江"}, {"31", "上海"}, {"32", "江苏"},
                                                    {"33", "浙江"}, {"34", "安徽"}, {"35", "福建"}, {"36", "江西"},
                                                    {"37", "山东"}, {"41", "河南"}, {"42", "湖北"}, {"43", "湖南"},
                                                    {"44", "广东"}, {"45", "广西"}, {"46", "海南"}, {"50", "重庆"},
                                                    {"51", "四川"}, {"52", "贵州"}, {"53", "云南"}, {"54", "西藏"},
                                                    {"61", "陕西"}, {"62", "甘肃"}, {"63", "青海"}, {"64", "宁夏"},
                                                    {"65", "新疆"}, {"71", "台湾"}, {"81", "香港"}, {"82", "澳门"},
                                                    {"91", "国外"}};

    private static final int weightFactor[] = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    private static final String checkCode[] = {"1", "0", "X", "9", "8", "7", "6", "5",
                                               "4", "3", "2"};

    private static boolean isProvince[] = new boolean[100];

    private static GregorianCalendar calendar;

    static {
        calendar = (GregorianCalendar) GregorianCalendar.getInstance();
        for (String[] code : provinceCode) {
            int offset = Integer.parseInt(code[0]);
            isProvince[offset] = true;
        }
    }

    @Override
    public void initialize(IdNumber constraintAnnotation) {
        this.idNumber = constraintAnnotation;
    }

    @Override
    public boolean isValid(String idNumber, ConstraintValidatorContext context) {
        if (idNumber == null) {
            return true;
        }

        return isValid(idNumber);
    }

    protected boolean isValid(String idNumber) {
        if (idNumber == null) {
            return false;
        }

        if (idNumber.length() == 15) {
            return false;
            //15 idNumbers is disabled 
            //return isValid15(idNumber);
        } else if (idNumber.length() == 18) {
            return isValid18(idNumber);
        }

        return false;
    }

    private boolean isValid15(String idNumber) {
        if (idNumber == null || idNumber.length() != 15) {
            return false;
        }

        if (!isDigital(idNumber)) {
            return false;
        }

        //check province code
        String province = idNumber.substring(0, 2);
        if (!isProvince[Integer.parseInt(province)]) {
            return false;
        }

        //check birthday
        String birthday = idNumber.substring(6, 12);
        int month = Integer.parseInt(idNumber.substring(8, 10));
        int day = Integer.parseInt(idNumber.substring(10, 12));

        //check birthday format and whether this date is before current time
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyMMdd").parse(birthday);
        } catch (ParseException ex) {
            Logger.getLogger(ChineseIdNumberValidator.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (birthDate == null || System.currentTimeMillis() <= birthDate.getTime()) {
            return false;
        }

        //check year, month, day
        calendar.setTime(birthDate);
        if (calendar.get(Calendar.YEAR) < IdNumberConstant.MIN_YEAR) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) {
                    return false;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    return false;
                }
            case 2:
                if (calendar.isLeapYear(calendar.get(Calendar.YEAR))) {
                    if (day < 1 || day > 29) {
                        return false;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        return false;
                    }
                }
        }

        return true;
    }

    private boolean isValid18(String idNumber) {
        if (idNumber == null || idNumber.length() != 18) {
            return false;
        }

        String idNumber17 = idNumber.substring(0, 17);
        String idNumber18Code = idNumber.substring(17, 18);
        char charArray[];

        //check prefix 17 numbers are all digital
        if (isDigital(idNumber17)) {
            charArray = idNumber17.toCharArray();
        } else {
            return false;
        }

        //check the sum of prefix 17 numbers mutilplied by weighted factor equals the last check code
        if (null != charArray) {
            if (!idNumber18Code.equals(
                    getCheckCode(
                    getPowerSum(
                    char2Int(charArray))))) {
                return false;
            }

        }

        //check province code
        String province = idNumber.substring(0, 2);
        if (!isProvince[Integer.parseInt(province)]) {
            return false;
        }

        //check birthday
        String birthday = idNumber.substring(6, 14);
        int year = Integer.parseInt(idNumber.substring(6, 10));
        int month = Integer.parseInt(idNumber.substring(10, 12));
        int day = Integer.parseInt(idNumber.substring(12, 14));

        //check birthday format and whether this date is before current time
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyyyMMdd").parse(birthday);
        } catch (ParseException ex) {
            Logger.getLogger(ChineseIdNumberValidator.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (birthDate == null || System.currentTimeMillis() <= birthDate.getTime()) {
            return false;
        }

        //check year, month, day
        if (year < IdNumberConstant.MIN_YEAR) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) {
                    return false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    return false;
                }
                break;
            case 2:
                if (calendar.isLeapYear(year)) {
                    if (day < 1 || day > 29) {
                        return false;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        return false;
                    }
                }
                break;
        }

        return true;
    }

    @SuppressWarnings("unused")
    private String convert15To18(String idNumber) {
        if (idNumber.length() != 15) {
            return null;
        }

        String idNumber17;
        if (isDigital(idNumber)) {
            String birthday = idNumber.substring(6, 12);
            Date birthdate = null;
            try {
                birthdate = new SimpleDateFormat("yyMMdd").parse(birthday);
            } catch (ParseException ex) {
                Logger.getLogger(ChineseIdNumberValidator.class.getName()).log(Level.SEVERE, null, ex);
            }

            calendar.setTime(birthdate);
            String year = String.valueOf(calendar.get(Calendar.YEAR));
            idNumber17 = idNumber.substring(0, 6) + year + idNumber.substring(8);
            char charArray[] = idNumber17.toCharArray();
            if (null != charArray) {
                int sum17 = getPowerSum(char2Int(charArray));
                idNumber17 += getCheckCode(sum17);
            }
        } else {
            return null;
        }
        return idNumber17;
    }

    private boolean isDigital(String str) {
        return str == null || "".equals(str) ? false : str.matches("[0-9]*");
    }

    private int getPowerSum(int[] bit) {
        int sum = 0;
        if (weightFactor.length != bit.length) {
            return sum;
        }
        for (int i = 0; i < bit.length; i++) {
            sum = sum + bit[i] * weightFactor[i];
        }
        return sum;
    }

    private String getCheckCode(int sum17) {
        return checkCode[sum17 % 11];
    }

    private int[] char2Int(char[] charArray) throws NumberFormatException {
        int[] array = new int[charArray.length];
        int k = 0;
        for (char temp : charArray) {
            array[k++] = Integer.parseInt(String.valueOf(temp));
        }
        return array;
    }
}
