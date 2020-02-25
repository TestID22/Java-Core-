package mergeAlgo;

import java.util.ArrayList;

import mergeAlgo.merger.Merger;

public class Main {

	public static void main(String[] args) {
		String[] names = {"Alex", "Antony"};
		String[] nameAnother = {"Vitalii", "Lena"};
		
		ArrayList<String> mergeArryList = Merger.arrrayStringMerge(names, nameAnother);
		mergeArryList.forEach(s -> System.out.println(s));
	}

}
