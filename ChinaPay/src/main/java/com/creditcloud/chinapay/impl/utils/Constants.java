package com.creditcloud.chinapay.impl.utils;

import java.io.File;

public class Constants {
	// ZMT : 中民投属性
	public static final String SINGLE_PAY_PRIVATE_KEY_ZMT = ProjectPaths.config() + "chinapay" + File.separator
			+ "SinglePay" + File.separator + "MerPrK_808080211389035_20150228173140.key";
	public static final String SINGLE_PAY_PUBLIC_KEY_ZMT = ProjectPaths.config() + "chinapay" + File.separator
			+ "SinglePay" + File.separator + "PgPubk.key";

	public static final String SINGLE_CUT_PRIVATE_KEY_ZMT = ProjectPaths.config() + "chinapay" + File.separator
			+ "SingleCut" + File.separator + "MerPrK_808080211389034_20150228173113.key";
	public static final String SINGLE_CUT_PUBLIC_KEY_ZMT = ProjectPaths.config() + "chinapay" + File.separator
			+ "SingleCut" + File.separator + "PgPubk.key";

	public static final String MERCHANT_ID_SINGLE_PAY_ZMT = "808080211389035";
	public static final String MERCHANT_ID_SINGLE_CUT_ZMT = "808080211389034";

	// 银联属性
	public static final String CHINAPAY_DEFAULT_ENCODING = "GBK";

	public static final String CHINAPAY_MERCHANT_ID = "999999999999999";// 银联虚拟商户号

	public static final String URL_SINGLE_PAY_POST_RPODUCT = "http://sfj.chinapay.com/dac/SinPayServletGBK";
	public static final String URL_SINGLE_PAY_POST_TEST = "http://sfj-test.chinapay.com/dac/SinPayServletGBK";
	public static final String URL_SINGLE_PAY_QUERY_PRODUCT = "http://sfj.chinapay.com/dac/SinPayQueryServletGBK";
	public static final String URL_SINGLE_PAY_QUERY_TEST = "http://sfj-test.chinapay.com/dac/SinPayQueryServletGBK";

	public static final String URL_SINGLE_CUT_POST_RPODUCT = "http://sfj.chinapay.com/dac/SinCutServletGBK";
	public static final String URL_SINGLE_CUT_POST_TEST = "http://sfj-test.chinapay.com/dac/SinCutServletGBK";
	public static final String URL_SINGLE_CUT_QUERY_PRODUCT = "http://sfj.chinapay.com/dac/SinCutQueryServletGBK";
	public static final String URL_SINGLE_CUT_QUERY_TEST = "http://sfj-test.chinapay.com/dac/SinCutQueryServletGBK";
}
