package com.september;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.september.Writer.DataWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		String names = in.nextLine();
		DataWriter data = new DataWriter(names);
		
//		FileInputStream file = new FileInputStream("d://names.txt");
//		int bufferSize = file.available();
//		
//		byte[] data = new byte[bufferSize];
//		file.read(data);
//		
//		String text = new String(data);
//		String[] splitNames = text.split("\n");
//		for(int i = 0; i < splitNames.length; i++) {
//			System.out.println(splitNames[i]);
//			
//		}
		
	}
}
