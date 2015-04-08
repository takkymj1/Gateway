package com.creditcloud.investmentfund.api.lion.moneyfund.utils;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static jdk.nashorn.internal.objects.NativeArray.map;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * @author Guohua Zhang
 *
 */
public abstract class StringUtils {

    public static String WINDOWS_LINE_SEPARATOR = "\r\n";
    public static String LINUX_LINE_SEPARATOR = "\n";

    public static boolean isMultipleLines(String text) {
        if (isEmpty(text)) {
            return false;
        }

        String tmpText = text.trim();
        return tmpText.contains(LINUX_LINE_SEPARATOR);
    }

    public static String repeat(String pattern, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(pattern);
        }
        return sb.toString();
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static Map<String, String> parseNamedValues(String text, String splitterKeyValuePair, String splitterKeyValue) {
        Map<String, String> map = new HashMap<>();
        if (text == null) {
            return map;
        }

        final String PAIR_DELIMITER = splitterKeyValuePair;
        final String NAME_VALUE_DELIMITER = splitterKeyValue;
        final boolean trimToken = true;
        List<String> namedValues = StringUtils.parseTokens(text, PAIR_DELIMITER, trimToken);
        for (String namedValue : namedValues) {
            Pair<String, String> kv = parseNamedValue(namedValue, NAME_VALUE_DELIMITER);
            if (kv == null) {
                continue;
            }

            String name = kv.getKey();
            String value = kv.getValue();
            map.put(name, value);
        }

        return map;
    }

    /**
     * 假定文本 text 是一个格式类似于 keyA=valueA 的文本，此方法尝试从中分析出
     * key和value，然后返回包含key和value的一个 Pair对象
     *
     * @param text
     * @param splitterKeyValue key和value的分隔符，在keyA=valueA 的形势下，这个分隔符就是 =
     * @return 包含key和value的一个 Pair对象
     */
    public static Pair<String, String> parseNamedValue(String text, String splitterKeyValue) {
        if (text == null) {
            return null;
        }

        final String NAME_VALUE_DELIMITER = splitterKeyValue;
        final boolean trimToken = true;

        List<String> nameAndValue = StringUtils.parseTokens(text, NAME_VALUE_DELIMITER, trimToken);
        String name = nameAndValue.get(0);
        String value = nameAndValue.size() >= 2 ? nameAndValue.get(1) : "";

        Pair<String, String> kv = ImmutablePair.of(name, value);
        return kv;
    }

    public static boolean isMultipleLines(Object text) {
        String v = text == null ? "" : String.valueOf(text);
        return isMultipleLines(v);
    }

    public static String removeTrailingColonOfLabelText(String labelText) {
        int idx = labelText.lastIndexOf(":");
        if (idx == -1) {
            return labelText;
        }

        return labelText.substring(0, idx);
    }

    public final static long toLong(String string) {
        return toLong(string, 0);
    }

    public final static long toLong(String string, long defaultValue) {
        if (isEmpty(string)) {
            return defaultValue;
        }

        try {
            string = string.trim();
            return Long.parseLong(string);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public final static int toInt(String string, int defaultValue) {
        if (isEmpty(string)) {
            return defaultValue;
        }

        try {
            string = string.trim();
            return Integer.parseInt(string);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public final static int toInt(String string) {
        return toInt(string, 0);
    }

    public final static String toYYYYMMDD(Date date) {
        String format = "yyyyMMdd";
        DateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }

    public final static Date fromYYYYMMDD(String yyyymmdd) {
        if (isEmpty(yyyymmdd)) {
            return null;
        }

        if (yyyymmdd.length() != 8) {
            return null;
        }

        String yyyy = yyyymmdd.substring(0, 4);
        String mm = yyyymmdd.substring(4, 6);
        String dd = yyyymmdd.substring(6);

        int year = toInt(yyyy);
        int month = toInt(mm) - 1;
        int day = toInt(dd);

        if (year <= 1970) {
            return null;
        }

        if (month < 0 || month > 11) {
            return null;
        }

        if (day < 0 || day > 31) {
            return null;
        }

        Calendar calendar = new GregorianCalendar(year, month, day);
        return calendar.getTime();
    }

    public final static List<String> trimElement(List<String> list) {
        for (int si = 0; si < list.size(); si++) {
            String s = list.get(si);
            if (s != null) {
                list.set(si, s.trim());
            }
        }

        return list;
    }

    public final static List<String> removeNullOrEmptyElement(List<String> list) {
        for (int si = 0; si < list.size();) {
            String s = list.get(si);
            if (s == null) {
                list.remove(si);
            } else if (s.isEmpty()) {
                list.remove(si);
            } else {
                si++;
            }
        }

        return list;
    }

    public final static boolean containsNullOrEmptyElement(List<String> list) {
        for (String s : list) {
            if (s == null) {
                return true;
            } else if (s.isEmpty()) {
                return true;
            }
        }

        return false;
    }

    public final static double toDouble(String string, double defaultValue) {
        try {
            string = string.trim();
            return Double.parseDouble(string);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public final static double toDouble(String string) {
        return toDouble(string, 0.0F);
    }

    private static final String QUOTATOIN_MARK = "\"";

    public static boolean isEnclosedByQuotationMarks(String field) {
        return field.startsWith(QUOTATOIN_MARK) && field.endsWith(QUOTATOIN_MARK);
    }

    public static String removeEnclosingQuotationMarks(String field) {
        boolean yes = isEnclosedByQuotationMarks(field);
        if (!yes) {
            return field;
        }

        String newField = field.substring(1, field.length() - 1);
        return newField;
    }

    public final static boolean toBoolean(String string, boolean defaultValue) {
        try {
            string = string.trim();
            return Boolean.parseBoolean(string);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public final static boolean toBoolean(String string) {
        return toBoolean(string, false);
    }

    /**
     * using format yyyy-MM-dd HH:mm:ss.SSS
     *
     * @param date
     * @return
     */
    public final static String fromDate(Date date) {
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }

    public final static String fromDate(Date date, String format) {
        DateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }

    public static boolean isEmpty(String s) {
        boolean empty = (s == null || s.trim().isEmpty());
        return empty;
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    public static String nonNull(String s) {
        return s == null ? "" : s;
    }

    public final static List<String> parseLines(String text) {
        List<String> lines = new ArrayList<>();
        if (text == null) {
            return lines;
        }
        try {
            StringReader sr = new StringReader(text);
            BufferedReader br = new BufferedReader(sr);
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    lines.add(line);
                }
            }

            return lines;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final static List<String> parseTokens(String line, String splitter, boolean trimToken) {
        boolean discardEmptyToken = false;
        List<String> tokens = parseTokens(line, splitter, trimToken, discardEmptyToken);
        return tokens;
    }

    /**
     * to something like \u1234\u5678
     *
     * @param text
     * @return
     */
    public static String toUnicode(String text) {
        StringBuilder unicode = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String codepoint = "\\u" + Integer.toHexString(c);
            unicode.append(codepoint);
        }
        return unicode.toString();
    }

    /**
     * 将\u1234\u5678这样的unicode codepoint编码串转换回字符串
     *
     * @param unicode
     * @return
     */
    public static String fromUnicode(String unicode) {
        StringBuilder chars = new StringBuilder();
        String hex[] = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) { // 注意要从 1 开始，而不是从0开始。第一个是空。
            int data = Integer.parseInt(hex[i], 16); // 将16进制数转换为 10进制的数据。
            chars.append((char) data); // 强制转换为char类型就是我们的中文字符了。
        }
        return chars.toString();
    }

    public final static List<String> parseTokens(String line, String splitter, boolean trimToken,
            boolean discardEmptyToken) {
        List<String> tokens = new ArrayList<>();
        if (line == null) {
            return tokens;
        }

        String[] tks = line.split(splitter);

        if (trimToken) {
            for (int ti = 0; ti < tks.length; ti++) {
                String tk = tks[ti];
                tks[ti] = tk.trim();
            }
        }

        if (discardEmptyToken) {
            for (String tk : tks) {
                if (isEmpty(tk)) {
                    continue;
                }

                tokens.add(tk);
            }
        } else {
            tokens = toStringList(tks);
        }

        return tokens;
    }

    /**
     * if any string in expected is contained by actual return true
     *
     * @param actual
     * @param expected
     * @param caseSensitive
     * @return
     */
    public final static boolean containsAny(String actual, String[] expected, boolean caseSensitive) {
        if (actual == null) {
            actual = "";
        }
        if (expected == null) {
            expected = new String[0];
        }

        for (String expectedItem : expected) {
            boolean suc = contains(actual, expectedItem, caseSensitive);
            if (suc) {
                return true;
            }
        }

        return false;
    }

    /**
     * check if any string in expected is contained by actual
     *
     * @param actual
     * @param expected
     * @param caseSensitive
     * @return
     */
    public final static boolean containsAll(String actual, String[] expected, boolean caseSensitive) {
        if (actual == null) {
            actual = "";
        }

        List<String> expectedToBeContained = toStringList(expected);
        for (String expectedToBeContainedItem : expectedToBeContained) {
            boolean suc = contains(actual, expectedToBeContainedItem, caseSensitive);
            if (!suc) {
                return false;
            }
        }

        return true;
    }

    public final static boolean contains(String str, String strExpectedToBeContained) {
        final boolean caseSensitive = true;
        return contains(str, strExpectedToBeContained, caseSensitive);
    }

    public final static boolean contains(String str, String strExpectedToBeContained, boolean caseSensitive) {
        String master = String.valueOf(str);
        String token = String.valueOf(strExpectedToBeContained);
        if (!caseSensitive) {
            master = master.toLowerCase();
            token = token.toLowerCase();
        }
        return master.contains(token);
    }

    public static List<String> toLowerCase(List<String> list) {
        if (list == null) {
            return list;
        }

        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            if (e != null) {
                list.set(i, e.toLowerCase());
            }
        }

        return list;
    }

    public static List<String> toUpperCase(List<String> list) {
        if (list == null) {
            return list;
        }

        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            if (e != null) {
                list.set(i, e.toUpperCase());
            }
        }

        return list;
    }

    public static String[] toStringArray(List<String> stringList) {
        if (stringList == null) {
            return new String[0];
        }

        return stringList.toArray(new String[0]);
    }

    public static List<String> toStringList(String[] stringArray) {
        if (stringArray == null) {
            return new ArrayList<>();
        }

        List<String> sl = new ArrayList<>();
        sl.addAll(Arrays.asList(stringArray));
        return sl;
    }

    public static List<String> toStringList(String string) {
        if (string == null) {
            return new ArrayList<>();
        }

        List<String> sl = new ArrayList<>();
        sl.add(string);
        return sl;
    }

    private final static String INTEGER_FORMAT = "-?\\d+";

    /**
     * parse and return integers from string
     *
     * @param str
     * @return
     */
    public static List<Integer> findIntegers(String str) {
        List<Integer> ints = new ArrayList<>();
        Pattern pattern = Pattern.compile(INTEGER_FORMAT);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            Integer num = toInt(group);
            ints.add(num);
        }

        return ints;
    }

    /**
     * parse and return first found integer in the string
     *
     * @param str
     * @return the integer value of found integer, null if nothing found
     */
    public static Integer findInteger(String str) {
        Pattern pattern = Pattern.compile(INTEGER_FORMAT);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }

        String group = matcher.group();
        int num = toInt(group);
        return num;
    }

    /**
     * 查找all中所有匹配正则表达式regex的字符串并返回这些字符串的集合
     *
     * @param all
     * @param regex
     * @return
     */
    public static List<String> filter(List<String> all, String regex) {
        List<String> filtered = new ArrayList<>();
        for (String item : all) {
            if (item.matches(regex)) {
                filtered.add(item);
            }
        }

        return filtered;
    }

    public static String fromException(Throwable e) {
        if (e == null) {
            return "";
        }

        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));

        String stackTraceInString = sw.toString();
        return stackTraceInString;
    }

    /**
     * Replace target string in template.
     *
     * @param template
     * @param replacements
     * @return
     */
    public static String replace(String template, Properties replacements) {
        String result = template;
        for (Object key : replacements.keySet()) {
            final String sourceTokenFilter = key.toString();
            final String targetValue = nonNull(replacements.getProperty(sourceTokenFilter));
            Pattern pattern = Pattern.compile(sourceTokenFilter);
            Matcher matcher = pattern.matcher(result);
            // while (matcher.find()) {
            // System.out.println(" matcher.group(): " + matcher.group());
            // }
            result = matcher.replaceAll(targetValue);
        }

        return result;
    }

    public static String replace(String str, String regex, String newValue) {
        Properties replacements = new Properties();
        replacements.put(regex, newValue);

        return replace(str, replacements);
    }
}
