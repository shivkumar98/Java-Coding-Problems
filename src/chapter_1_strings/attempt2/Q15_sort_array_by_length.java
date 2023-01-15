package chapter_1_strings.attempt2;

import java.util.HashMap;
import java.util.Map;

public class Q15_sort_array_by_length {

	static String[] sortArraysByLength(String[] strings) {
		Map<Integer,Integer> stringLengths= new HashMap<>();
		for (int i=0;i<strings.length;i++) {
			stringLengths.put(i, strings[i].length());
		}
		System.out.println(stringLengths);
		// need to figure out how to sort by value!
		return strings;
	}
	
	public static void main(String[] args) {
		System.out.println(sortArraysByLength(new String[] {"Shiv", "Kumar"}));
		System.out.println(sortArraysByLength(new String[] {"Shiv", "Kumar", "hi", "my", "name", "is"}));
	}
}
