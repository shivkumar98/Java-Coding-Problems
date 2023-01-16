package chapter_1_strings.attempt2;

import java.util.Arrays;

public class Q18_check_anagram {
	
	// check whether two strings are anagarams
	// ignore whitespace
	
	static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase().replaceAll("[ ]*", "");
		str2 = str2.toLowerCase().replaceAll("[ ]*", "");
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		// return charArr1.equals(charArr2); // does not work
		return Arrays.equals(charArr1,charArr2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("hello", "heoll")); // true
		System.out.println(isAnagram("hello", "bye")); // false
	}
	
	

}
