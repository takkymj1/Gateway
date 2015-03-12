package com.creditcloud.chinapay.api.model.pojo;


public class PlainTextSignaturePair extends POJO {
	public String plainText = "";
	public String signature = "";

	public static boolean isNullPair(PlainTextSignaturePair pair) {
		if (pair == null || pair.plainText == null || pair.signature == null)
			return true;

		return pair.plainText.isEmpty() && pair.signature.isEmpty();
	}

        @Override
	public String toString() {
		return plainText + "," + signature;
	}
}
