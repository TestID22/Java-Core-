package mergeAlgo.merger;

import java.util.ArrayList;

import javax.print.attribute.standard.Severity;

public class Merger {
	public static ArrayList<String> arrrayStringMerge(String[] firstArray, String[] secondArray ){
		int count = 1;
		ArrayList<String> mergeList = new ArrayList<>();
		for(String s : firstArray) mergeList.add(count++ + " " + s);
		for(String s : secondArray) mergeList.add(count++ + " " + s);
		return mergeList;
	}
}
