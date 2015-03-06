package com.creditcloud.chinapay.impl.utils;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * SignUtil.java
 * 
 * @author sun.jun
 * @serial
 * @since 2014年5月23日 上午10:17:56
 */
public class BankValidatorSignUtils {

	/**
	 * 应答数据解析成map
	 * 
	 * @param msg
	 * @return
	 */
	public static Map parseResponse(String msg) {
		Map paramsMap = new HashMap();
		int beginIndex = 0;
		int endIndex = 0;
		while (true) {
			// 解析参数名
			endIndex = msg.indexOf("=", beginIndex);
			String key = null;
			String value = null;
			if (endIndex > beginIndex) {
				key = msg.substring(beginIndex, endIndex);
			} else {
				break;
			}
			// 解析参数值
			beginIndex = endIndex + 1;
			endIndex = msg.indexOf("&", beginIndex);
			if (endIndex >= beginIndex) {
				value = msg.substring(beginIndex, endIndex);
				paramsMap.put(key, value);
				// 移动游标
				beginIndex = endIndex + 1;
			} else {
				value = msg.substring(beginIndex);
				paramsMap.put(key, value);
				break;
			}
		}
		return paramsMap;
	}

	/**
	 * 转换成url参数
	 * 
	 * @param parameters
	 * @param toSort
	 *            是否排序
	 * @param keysToIgnore
	 *            要剔除的元素
	 * @return
	 */
	public static String buildURLParameters(Map<String, String> parameters, boolean toSort, Set<String> keysToIgnore) {
		List<String> pairs = new ArrayList<String>();
		for (String key : parameters.keySet()) {
			if (keysToIgnore != null && keysToIgnore.contains(key))
				continue;

			String value = parameters.get(key);
			String pair = key + "=" + value;
			pairs.add(pair);
		}

		if (toSort) { // 排序
			Collections.sort(pairs);
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < pairs.size(); i++) {
			String pair = (String) pairs.get(i);
			if (i > 0)
				sb.append("&");

			sb.append(pair);
		}

		String urlParameters= sb.toString();
		return urlParameters;
	}

	/**
	 * 签名
	 * 
	 * @param signedMsg
	 * @param key
	 * @return
	 */
	public static String sign(String signedMsg, String key) {
		try {
			MessageDigest digit = MessageDigest.getInstance("MD5");
			digit.update((signedMsg + key).getBytes("UTF-8"));
			return byte2hex(digit.digest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * byte array to hex
	 * 
	 * @param bytes
	 *            byte array
	 * @return hex string
	 */
	public static String byte2hex(byte[] bytes) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < bytes.length; i++) {
			String stmp = Integer.toHexString(bytes[i] & 0xFF).toUpperCase();
			if (stmp.length() == 1) {
				sb.append("0").append(stmp);
			} else {
				sb.append(stmp);
			}
		}
		return sb.toString();
	}
}
