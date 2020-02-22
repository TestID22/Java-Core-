package com.september.Writer;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriter {
	String data;

	public DataWriter(String data) throws IOException {
		this.data = data;
		saveData(data + " ");
	}
	
	private void saveData(String inputData) throws IOException{
		FileOutputStream saver = new FileOutputStream("d:/names.txt", true);
		byte[] dataArr = inputData.getBytes();
		saver.write(dataArr);
		saver.close();
	}
	
}
