package com.september;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.september.DataReader.DataReader;
import com.september.Writer.DataWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите данные");
		String names = in.nextLine();
		DataWriter data = new DataWriter(names);
		
		DataReader.Reader();
		
	}
}
