package com.september.Linked.Logic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import com.september.Linked.Model.Book;

public class Library implements Serializable {
	// Чтоб сериализовать данные, класс и его поля должны имлементить(реализовать
	// Serializeble интерфейс).
	private static final long serialVersionUID = 1L;
	Book book;
	LinkedList<Book> books = new LinkedList<Book>();

	public Library() {

	}

	public void addBook(String name, String language) throws FileNotFoundException, IOException {
		book = new Book(name, language);
		books.add(book);
		saveLib();
	}

	public void addBook(Book book) throws FileNotFoundException, IOException {
		books.add(book);
		saveLib();
	}

	public void saveLib() throws FileNotFoundException, IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			oos.writeObject(books);
			oos.close();
		}
	}

	public void loadLib() throws ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			LinkedList<Book> loadLib = (LinkedList<Book>) ois.readObject();
			for(Book b : loadLib) {
				System.out.println((loadLib.indexOf(b) + 1) + ". " + b.getName() +  " " +  b.getLanguage());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
