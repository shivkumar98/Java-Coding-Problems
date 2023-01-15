package chapter_1_strings.attempt2;

import java.util.HashSet;
import java.util.Set;

public class Q12_solution {
	
	// solution 1:
	// this solution relies on the indexOf method
	static String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<str.length();i++) {
			// check if character is in sb:
			if (sb.indexOf(String.valueOf(str.charAt(i)))==-1) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	// solution 2:
	// this relies on HashSet to ensure duplicates are removed
	// if a character is successfully added, this indicates its the first instance
	static String removeDuplicates2(String str) {
		char[] chArr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		Set<Character> characters = new HashSet<>();
		
		for (char ch: chArr) {
			if (characters.add(ch)==true) {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("hello"));
		System.out.println(removeDuplicates2("hello"));
		System.out.println(removeDuplicates2("aaabbbbbc"));
	}

}
