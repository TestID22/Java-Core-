package com.september.DataReader;

import java.io.FileInputStream;
import java.io.IOException;

public class DataReader {
	public static void Reader() throws IOException {
		FileInputStream fileReader = new FileInputStream("d:/names.txt");
		int buffersize = fileReader.available();
		byte[] dataBuffer = new byte[buffersize];
		fileReader.read(dataBuffer);
		String text = new String(dataBuffer);
		String[] splitString = text.split("\n");
		
		for(int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
		}
	}
}
