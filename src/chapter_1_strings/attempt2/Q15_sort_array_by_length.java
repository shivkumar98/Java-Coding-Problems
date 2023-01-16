package chapter_1_strings.attempt2;

import java.util.Arrays;
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

class Solution15 {
	// sort an array of string by length
	// solution 1:
	static String[] sortArrayByLength(String[] strs) {
		Arrays.sort(strs,(s1,s2)->s1.length()-s2.length());
		return strs;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByLength(new String[] {"aaaaa", "bb", "c", "ddd"})));
	}
}
