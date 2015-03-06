package com.creditcloud.chinapay.impl.utils;

public class MockMerSeqIdGenerator {
	private static long current = System.currentTimeMillis();

	public synchronized static String next() {
		String next = String.format("%016d", current);
		current++;
		return next;
	}

	public synchronized static String current() {
		return ""+current;
	}
}
