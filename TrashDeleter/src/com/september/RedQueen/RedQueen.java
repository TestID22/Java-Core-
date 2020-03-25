package com.september.RedQueen;

import java.io.IOError;
import java.io.IOException;

public class RedQueen {
	public RedQueen() {
	}

	public void sayHello() throws InterruptedException, IOException {

		String hello = "Привет хозяин виталий\nя красная королева\n";
		char[] helloChar = hello.toCharArray();
		for (int i = 0; i < helloChar.length; i++) {
			System.out.print(Character.toUpperCase(hello.charAt(i)));
			Thread.sleep(100);
			System.out.flush();
		}
	}

}
