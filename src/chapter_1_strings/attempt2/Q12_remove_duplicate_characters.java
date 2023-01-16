package chapter_1_strings.attempt2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q12_remove_duplicate_characters {
	
	static String removeDuplicateCharacters(String str) {
		// get set of characters which occur more than once
		Set<Character> characterCount = new LinkedHashSet<>();
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if (str.length()-str.replaceAll(String.valueOf(c), "").length()==1) {
				characterCount.add(c);
			}
		}
		StringBuilder result = new StringBuilder();
		characterCount.forEach(t -> result.append(t) );
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicateCharacters("hello"));
	}

}

class Solution12 {
	
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
	
}