package chapter_1_strings.attempt1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q12_RemovingDuplicateCharacters {
	
	/*
	 * Write a program that removes the
duplicate characters from the given string
	Note: I assumed to remove all characters which were repeated 
	 */
	
	public static String removeDuplicates(String str) {
		Map<Character, Integer> characterCount = new HashMap<>();
		int n = str.length();
		for (int i = 0; i<n; i++) {
			characterCount.compute(str.charAt(i), (k,v)->(v==null)?1:++v);
		}
		
		System.out.println(characterCount);
		
		for ( Character c: characterCount.keySet()) {
			if (characterCount.get(c) > 1) {
				str=str.replace(c.toString(), "");
			}
		}
		
		System.out.println(str);
		
		return "hello";		
	}
	
	public static String removeDuplicates_v2(String str) {
		int n = str.length();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < n; i++ ) {
			int counter = 0;
			Character character = sb.charAt(i);
			for (int j = 0; j != i && j<=n ; j++) {
				if (character==sb.charAt(j) ) {
					counter++;
				}
			}
			if (counter > 0 ) {
				str = str.replace(character.toString(), "");
			}
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		removeDuplicates("hello"); // he
		System.out.println(removeDuplicates_v2("aaaaabbbbbbbbcdddfggggg")); // cf
	}

}
