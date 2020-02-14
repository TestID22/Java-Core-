package com.september.Linked.Model;

import java.io.Serializable;

public class Book implements Serializable {
	int id = 0;
	String name;
	String language;

	public Book(String name, String language) {
		this.name = name;
		this.language = language;
		id = +1;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
