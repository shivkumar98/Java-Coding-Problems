package chapter_1_strings.attempt2;

import java.util.Arrays;

public class Q15_solution {
	
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
