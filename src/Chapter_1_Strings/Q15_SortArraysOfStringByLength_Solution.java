package Chapter_1_Strings;

import java.util.Arrays;

public class Q15_SortArraysOfStringByLength_Solution {

	public static void sortArrayByLength(String[] strs) {
		Arrays.sort(strs, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
	}

	public static void main(String[] args) {
		String[] strings = { "12345", "234", "1", "12" };
		sortArrayByLength(strings);
		System.out.println(Arrays.toString(strings)); // [1, 12, 234, 12345]
	}
}
