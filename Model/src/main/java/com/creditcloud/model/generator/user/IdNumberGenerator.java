/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.generator.user;

import com.creditcloud.model.generator.StringGenerator;
import com.creditcloud.model.util.Regions;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author rooseek
 */
public class IdNumberGenerator extends StringGenerator {

    private static final String regionCodes[];

    private static final int weightFactor[] = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    private static final String checkCode[] = {"1", "0", "X", "9", "8", "7", "6", "5",
                                               "4", "3", "2"};

    private static final int[] dates;

    static {
        //let's generate dates between 1900/1/1 to 1999/12/31, for each month we will only get the first 28 days for simpiliciy
        dates = new int[100 * 12 * 28];
        int i = 0;
        for (int year = 1900; year <= 1999; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 28; day++) {
                    dates[i++] = 10000 * year + month * 100 + day;
                }
            }
        }

        //then generate all valid regions
        Set<String> regionSet = Regions.getRegionMap().keySet();
        regionCodes = regionSet.toArray(new String[regionSet.size()]);
    }

    public IdNumberGenerator(Random random) {
        super(random);
    }

    @Override
    public String[] generate(int number) {
        if (number < 1) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }

        Set<String> exist = new HashSet<String>();
        int i = 0;
        while (i < number) {
            String region = regionCodes[randomInt() % regionCodes.length];
            int birthday = dates[randomInt() % dates.length];
            String rd = String.format("%02d", randomInt() % 100);
            int gender = randomInt() % 10;
            String prefix = region
                    .concat(Integer.toString(birthday))
                    .concat(rd)
                    .concat(Integer.toString(gender));
            char[] chars = prefix.toCharArray();
            int[] intArray = char2Int(chars);
            int powerSum = getPowerSum(intArray);
            String code = getCheckCode(powerSum);

            String idNumber = prefix.concat(code);
            if (!exist.contains(idNumber)) {
                exist.add(idNumber);
                i++;
            }
        }

        return exist.toArray(new String[exist.size()]);
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
