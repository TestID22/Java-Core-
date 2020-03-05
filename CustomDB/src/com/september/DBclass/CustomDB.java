package com.september.DBclass;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;

import com.setpember.RowEntity.RowDB;

public class CustomDB {
	int rowCounter = 0;
	public ArrayList<RowDB> dataBaseInside = new ArrayList<>();

	public CustomDB() {

	}

	public void showData() {
		for (RowDB s : dataBaseInside) {
			System.out.println(s.getData());
		}
		System.out.println("Количество строк: " + rowCounter);

	}

	public int getCounter() {
		return rowCounter;
	}

	public void insert(RowDB insertDB) {
		dataBaseInside.add(insertDB);
		rowCounter++;
	}

	public void insert(RowDB[] insertDBArray) {
		for (int i = 0; i < insertDBArray.length; i++) {
			dataBaseInside.add(insertDBArray[i]);
			rowCounter++;
		}
	}

	public void delete(int index) {
		if (index >= dataBaseInside.size())
			System.out.println("Строки с номером " + rowCounter + " нет");
		else {
			dataBaseInside.remove(index);
			rowCounter--;

		}

	}

	public void update(int index, String data) {
		RowDB row = new RowDB(data);
		dataBaseInside.set(index, row);
	}
}
