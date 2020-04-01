package notepad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import jdk.jfr.DataAmount;

public class Main {
	static String path = "d:\\test";
	static String data;
	static byte dataArray[];

	public static void main(String[] args) throws FileNotFoundException {
		for (int i = 0; i <= args.length - 1; i++) {
			data += args[i] + " ";

		}

		dataArray = data.getBytes();
		System.out.println(data);

		File f = new File(path, "note.txt");

		FileOutputStream fos = new FileOutputStream(f);
		try {
			fos.write(dataArray);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
