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

class Solution18 {
	// solution 1
	// we can remove whitespace using \\s
	// we shall use an array to represent the characters of the strings
	// for one string we will subtract characters
	// the other we will add
	
	static boolean isAnagaram(String str1, String str2) {
		int[] charCount = new int[256];
		char[] charArr1 = str1.replaceAll("\\s", "")
				.toLowerCase().toCharArray();
		char[] charArr2 = str2.replaceAll("\\s", "")
				.toLowerCase().toCharArray();
		if (charArr1.length!=charArr2.length)
			return false;
		
		for (int i=0;i<charArr1.length;i++) {
			charCount[charArr1[i]]++;
			charCount[charArr2[i]]--;
		}
		for (int i: charCount) {
			if (i!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagaram("hello", "lleoh"));
		System.out.println(isAnagaram("hello", "helly"));
		
	}
	
}