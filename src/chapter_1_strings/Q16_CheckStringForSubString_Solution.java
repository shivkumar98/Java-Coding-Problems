package chapter_1_strings;

import java.util.regex.Pattern;

/*  Write a program that checks
	whether the given string contains the given substring.
 */


public class Q16_CheckStringForSubString_Solution {
	
	static boolean containsSubstring1(String text, String substring) {
		return text.contains(substring);
	}
	
	static boolean containsSubstring2(String text, String substring) {
		return text.indexOf(substring) !=-1;
	}
	
	// use regex:
	static boolean containsSubstring3(String text, String substring) {
		return text.matches(".*"+Pattern.quote(substring) +".*");
	}
	
	public static void main(String[] args) {
		System.out.println(containsSubstring2("hello", "hell")); // true
		System.out.println(containsSubstring3("hello world", "ello world")); // true
	}
	

}
