package chapter_1_strings.attempt2;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Q17_counting_substring_occurences {

	// count the occurences of a string in another string
	static int countOccurences(String text, String subtext) {
		String[] split = text.split(Pattern.quote(subtext));
		return split.length-1;
	}
	
	public static void main(String[] args) {
		System.out.println(countOccurences("hellohellisbadhellington", "hell")); // 3
		System.out.println(countOccurences("hellohellisbadhellington", "xyz")); // 3
		System.out.println(countOccurences("hello","hell")); // 1
	}
}

class Solution17 {
	// there are 2 interpretations to this problem:
	// 11 in 111 occurs once
	// 11 in 111 occurs twice
	
	// solution 1:
	static int countStringInString(String string, String toFind) {
		int count = 0;
		int n = toFind.length();
		for (int i=0;i<string.length();i+=n) {
			if (string.indexOf(toFind, i)!=-1)
				count++;
		}
		return count;
	}
	// solution 2:
	static int countStringInString2(String string, String toFind) {
		int count = 0;
		int n = toFind.length();
		
		for (int i=0;i<string.length();i++) {
			if (string.indexOf(toFind, i)!=-1)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countStringInString("111", "11")); // 1
		System.out.println(countStringInString2("111", "11")); // 2
		System.out.println(countStringInString("11", "111")); // 0
	}
}