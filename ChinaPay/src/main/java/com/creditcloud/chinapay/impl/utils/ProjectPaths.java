package com.creditcloud.chinapay.impl.utils;

import java.io.File;

public class ProjectPaths {
	/**
	 * 项目运行的当前目录，结尾没有目录分隔符
	 * 
	 * @return
	 */
	public static String root() {
		String root = System.getProperty("user.dir");
		File rootDir = new File(root);
		return rootDir.getAbsolutePath();
	}

	/**
	 * {root}/config/ , 结尾有目录分隔符
	 * 
	 * @return
	 */
	public static String config() {
		return root() + File.separator + "config" + File.separator;
	}

	/**
	 * {root}/log/ , 结尾有目录分隔符
	 * 
	 * @return
	 */
	public static String log() {
		return root() + File.separator + "log" + File.separator;
	}
}
