package com.creditcloud.common.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

@Slf4j
public class Pinyin4jUtils {
    
    /**
     * 汉字转换位汉语拼音首字母，英文字符不变，特殊字符丢弃,支持多音字，生成方式如（长沙市长:cssc,zssz,zssc,cssz）
     *
     * @param hanzi汉字
     * @return 拼音首字母(默认大写)
     */
    public static String converterToFirstSpell(String hanzi) {
        StringBuilder pinyin = new StringBuilder();
        char[] hanziChar = hanzi.toCharArray();

        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        for (int i = 0; i < hanziChar.length; i++) {
            if (hanziChar[i] > 128) {
                try {
                    // 取得当前汉字的所有全拼
                    String[] strs = PinyinHelper.toHanyuPinyinStringArray(hanziChar[i], defaultFormat);
                    if (strs != null) {
                        for (int j = 0; j < strs.length; j++) {
                            // 取首字母
                            pinyin.append(strs[j].charAt(0));
                            if (j != strs.length - 1) {
                                pinyin.append(",");
                            }
                        }
                    }
					// else {
                    // pinyinName.append(nameChar[i]);
                    // }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    log.error("", e);
                }
            } else {
                pinyin.append(hanziChar[i]);
            }
            pinyin.append(" ");
        }
        // return pinyinName.toString();
        return parseTheChineseByObject(discountTheChinese(pinyin.toString()));
    }

    /**
     * 汉字转换位汉语全拼，英文字符不变，特殊字符丢失
     * 支持多音字，生成方式如（重当参:zhongdangcen,zhongdangcan,chongdangcen,chongdangshen,zhongdangshen,chongdangcan）
     *
     * @param hanzi 汉字
     * @param firstUpperCase 首字母大写
     * @return 拼音(默认小写) 多音字组合并以,分隔
     */
    public static String converterToSpell(String hanzi, boolean firstUpperCase) {
        StringBuilder pinyin = new StringBuilder();
        char[] hanziChar = hanzi.toCharArray();

        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        for (int i = 0; i < hanziChar.length; i++) {
            if (hanziChar[i] > 128) {
                try {
                    // 取得当前汉字的所有全拼
                    String[] strs = PinyinHelper.toHanyuPinyinStringArray(hanziChar[i], defaultFormat);
                    if (strs != null) {
                        for (int j = 0; j < strs.length; j++) {
                            pinyin.append(strs[j]);
                            if (j != strs.length - 1) {
                                pinyin.append(",");
                            }
                        }
                    }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pinyin.append(hanziChar[i]);
            }
            pinyin.append(" ");
        }
        // return pinyinName.toString();
        return parseTheChineseByObject(discountTheChinese(pinyin.toString()));
    }

    /**
     * 去除多音字重复数据
     *
     * @param theStr
     * @return
     */
    private static List<Map<String, Integer>> discountTheChinese(String theStr) {
        // 去除重复拼音后的拼音列表
        List<Map<String, Integer>> mapList = new ArrayList<>();
        // 用于处理每个字的多音字，去掉重复
        Map<String, Integer> onlyOne = null;
        String[] firsts = theStr.split(" ");
        // 读出每个汉字的拼音
        for (String str : firsts) {
            onlyOne = new Hashtable<>();
            String[] china = str.split(",");
            // 多音字处理
            for (String s : china) {
                Integer count = onlyOne.get(s);
                if (count == null) {
                    onlyOne.put(s, 1);
                } else {
                    onlyOne.remove(s);
                    count++;
                    onlyOne.put(s, count);
                }
            }
            mapList.add(onlyOne);
        }
        return mapList;
    }

    /**
     * 解析并组合拼音，对象合并方案(推荐使用)
     *
     * @return
     */
    private static String parseTheChineseByObject(List<Map<String, Integer>> list) {
        Map<String, Integer> first = null; // 用于统计每一次,集合组合数据
        // 遍历每一组集合
        for (Map<String, Integer> list1 : list) {
            // 每一组集合与上一次组合的Map
            Map<String, Integer> temp = new Hashtable<>();
            // 第一次循环，first为空
            if (first != null) {
                // 取出上次组合与此次集合的字符，并保存
                for (String s : first.keySet()) {
                    for (String s1 : list1.keySet()) {
                        String str = s + s1;
                        temp.put(str, 1);
                    }
                }
                // 清理上一次组合数据
                if (temp.size() > 0) {
                    first.clear();
                }
            } else {
                for (String s : list1.keySet()) {
                    String str = s;
                    temp.put(str, 1);
                }
            }
            // 保存组合数据以便下次循环使用
            if (temp.size() > 0) {
                first = temp;
            }
        }
        String returnStr = "";
        if (first != null) {
            // 遍历取出组合字符串
            for (String str : first.keySet()) {
                returnStr += (str + ",");
            }
        }
        if (returnStr.length() > 0) {
            returnStr = returnStr.substring(0, returnStr.length() - 1);
        }
        return returnStr;
    }

}
