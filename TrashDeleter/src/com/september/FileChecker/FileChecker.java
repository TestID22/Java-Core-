package com.september.FileChecker;

import java.io.File;
import java.util.Scanner;

public class FileChecker {
	File file;
	File[] fileInDir;
	Scanner in = new Scanner(System.in);
	String tempDirectory = "C:\\Users\\755E~1\\AppData\\Local\\Temp";

	public FileChecker() {
		file = new File(tempDirectory);
	}

	public FileChecker(String dirName) {
		file = new File(dirName);
		fileInDir = file.listFiles();
	}

	public void getFiles() {
		System.out.println("Файлов в папке " + fileInDir.length);
	}

	public void deleteFiles() {
		if (fileInDir.length > 0) {
			for (File f : fileInDir)
				f.delete();
		} else {
			System.out.println("Папка пуста");
		}
	}

	public void deleteFilesFromTemp() {
		int fileSizeCounter = 0;
		if (fileInDir.length > 0) {
			for (var f : fileInDir) {
				fileSizeCounter += f.length();
				f.delete();
			}
			System.out.println("Удалено " + fileInDir.length + " файлов\n" + "Освобождено " + fileSizeCounter);
		}
	}

	public void deleteDirFromTemp() {
		File[] dir = file.listFiles();
		for (var f : dir) {
			System.err.println(f);
			f.delete();
		}
		System.out.println();
	}
}
