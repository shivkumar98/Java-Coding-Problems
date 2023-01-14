package chapter_1_strings.attempt1;

/*
 * Write a program that checks
whether the given string contains the given substring.
 */

public class Q16_CheckStringForSubString {
	
	public static boolean containsSubstring(String string, String substring) {
		StringBuilder sb = new StringBuilder(string);
		
		if (sb.indexOf(substring) == -1) {
			return false;
		} return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(containsSubstring("hello", "ello")); // true
		System.out.println(containsSubstring("hello", "ello dere")); // false
	}
	
}
