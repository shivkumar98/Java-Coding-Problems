package chapter_1_strings.attempt2;

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
