package com.september.Linked.UI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.september.Linked.Logic.Library;
import com.september.Linked.Model.Book;

public class App {

	private static Library myLib;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		myLib = new Library();
		myLib.addBook("ewq", "qewe");
		myLib.addBook(new Book("Python", "Учим"));
		myLib.addBook(new Book("Python", "Учим11"));
		
		myLib.loadLib();
		
	}

}
