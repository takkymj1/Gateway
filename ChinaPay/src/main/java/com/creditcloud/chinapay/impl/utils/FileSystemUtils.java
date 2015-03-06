package com.creditcloud.chinapay.impl.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Guohua Zhang
 *
 */
public abstract class FileSystemUtils {
	public static void replaceFileContent(String file, Properties replacements) {
		String fileContent = readFile(file);

		for (Object key : replacements.keySet()) {
			String target = key.toString();
			String replacement = replacements.getProperty(target);
			Pattern pattern = Pattern.compile(target);
			Matcher matcher = pattern.matcher(fileContent);
			// while (matcher.find()) {
			// System.out.println(" matcher.group(): " + matcher.group());
			// }
			fileContent = matcher.replaceAll(replacement);
		}

		final String charsetName = null;
		writeFile(file, fileContent, charsetName);
	}

	public static String renameFile(String file, String newFileName) {
		File oldFile = new File(file);
		if (!oldFile.exists())
			throw new RuntimeException("File/Directory does not exist : " + file);

		oldFile = new File(oldFile.getAbsolutePath());
		String parent = oldFile.getParent();
		File newFile = (parent == null) ? new File(newFileName) : new File(parent + File.separator + newFileName);
		oldFile.renameTo(newFile);
		return newFile.getAbsolutePath();
	}

	public static void replaceFileContent(String[] files, Properties replacements) {
		for (String file : files) {
			replaceFileContent(file, replacements);
		}
	}

	public static String readFile(String file) {
		try {
			return readFile(file, Charset.defaultCharset().name());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static long fileSize(String file) {
		File theFile = new File(file);
		long length = theFile.length();
		return length;
	}

	public static String readFile(String file, String encoding) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
			StringBuilder builder = new StringBuilder();
			char[] chars = new char[4096];

			int length = 0;

			while (0 < (length = reader.read(chars))) {
				builder.append(chars, 0, length);
			}

			String content = builder.toString();
			reader.close();

			return content;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void writeFile(String file, String content, String encoding) {
		if (encoding == null) {
			writeFile(file, content);
			return;
		}

		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), encoding), true);
			pw.print(content);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void writeFile(String file, String content) {
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file)), true);
			pw.print(content);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * recursively delete all contained files and sub-directories
	 * 
	 * @param directoryPath
	 * @return
	 */
	public static boolean delete(String directoryPath) {
		File d = new File(directoryPath);
		if (!d.exists())
			return true;

		if (d.isFile())
			return d.delete();

		for (File sub : d.listFiles()) {
			if (sub.isFile()) {
				if (!sub.delete())
					return false;
			} else {
				if (!delete(sub.getAbsolutePath()))
					return false;
			}
		}
		return d.delete();
	}

	public static boolean delete(String fromDirectoryPath, String subFolderNameRegex) {
		if (!fromDirectoryPath.endsWith(File.separator))
			fromDirectoryPath += File.separator;

		List<String> subfolders = getSubfolders(fromDirectoryPath, subFolderNameRegex);
		boolean all_ok = true;
		for (String sub : subfolders) {
			String dirName = fromDirectoryPath + sub;
			boolean ok = delete(dirName);
			all_ok = all_ok & ok;
		}
		return all_ok;
	}

	public static List<String> getSubfolders(String fromDirectoryPath, final String subFolderNameRegex) {
		List<String> subfolders = new ArrayList<String>();
		if (!existDirectory(fromDirectoryPath))
			return subfolders;

		File[] files = new File(fromDirectoryPath).listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if (!pathname.isDirectory())
					return false;

				String name = pathname.getName();
				if (name.matches(subFolderNameRegex))
					return true;
				else
					return false;
			}
		});

		for (File file : files) {
			String name = file.getName();
			subfolders.add(name);
		}
		return subfolders;
	}

	public static List<String> getContainedFiles(String fromDirectoryPath, final String containedFileNameRegex) {
		List<String> containedFiles = new ArrayList<String>();
		if (!existDirectory(fromDirectoryPath))
			return containedFiles;

		File[] files = new File(fromDirectoryPath).listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if (!pathname.isFile())
					return false;

				String name = pathname.getName();
				if (name.matches(containedFileNameRegex))
					return true;
				else
					return false;
			}
		});

		for (File file : files) {
			String name = file.getName();
			containedFiles.add(name);
		}
		return containedFiles;
	}

	public static boolean existFile(String path) {
		File d = new File(path);
		if (!d.exists())
			return false;

		if (d.isDirectory())
			return false;

		return true;
	}


	/**
	 * parse the file extension of the given path, if no file extension part
	 * found, return ""
	 * 
	 * @param path
	 * @return
	 */
	public static String getFileExtension(String path) {
		final String DOT = ".";
		int idx = path.lastIndexOf(DOT);
		if (idx > 0) {
			String ext = path.substring(idx + 1);
			return ext.trim().toUpperCase();
		} else
			return "";
	}

	/**
	 * parse the folder where the file exists from the full path for the file,
	 * ended with file separator
	 * 
	 * @param path
	 * @return
	 */
	public static String getFileFolder(String path) {
		final String sep = File.separator;
		String tmpPath = path.replace("\\", sep);
		int lastSepIdx = tmpPath.lastIndexOf(sep);
		if (lastSepIdx <= 0)
			throw new RuntimeException("The file path contains no directory information : " + path);

		String folder = tmpPath.substring(0, lastSepIdx) + sep;
		return folder;
	}

	public static boolean existDirectory(String path) {
		File d = new File(path);
		if (!d.exists())
			return false;

		if (d.isDirectory())
			return true;

		return false;
	}

	public static void ensureDirectory(String path) {
		File d = new File(path);
		if (d.exists())
			return;

		boolean ok = d.mkdirs();
		if (!ok)
			throw new RuntimeException("Directory '" + path + "' cannot be created");
	}

	/**
	 * 复制文件为另外一个文件或者到目标目录下面的同名文件
	 * 
	 * @param oldPath
	 *            String the file to copy from:c:/f001.sql
	 * @param newPath
	 *            String the file to copy to:c:/f002.sql or a path like c:
	 */
	public static void copyFile(String oldPath, String newPath) {
		int byteRead = 0;
		File fromFile = new File(oldPath);
		if (!fromFile.exists())
			throw new RuntimeException("The file to copy does not exist :" + oldPath);

		String targetFinalPath = newPath;
		File target = new File(newPath);
		if (target.isDirectory())
			targetFinalPath = target.getAbsolutePath() + fromFile.getName();

		try {
			InputStream inStream = new FileInputStream(oldPath);
			FileOutputStream toFile = new FileOutputStream(targetFinalPath);
			final byte[] buffer = new byte[4096];
			while ((byteRead = inStream.read(buffer)) != -1) {
				toFile.write(buffer, 0, byteRead);
			}
			inStream.close();
			toFile.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
