package Chapter_1_Strings;

import java.util.HashMap;
import java.util.Map;

public class Q01_CountDuplicateCharacters_Solution {

	/*
	 * Counting duplicate characters: Write a program that counts duplicate
characters from a given string.
	 */
	
	//we can use a map to store the key, value pairs
	
	static String CountDuplicateCharcters(String str) {
		Map<Character, Integer> characterCount = new HashMap<>();
		
		for (int i =0; i<str.length();i++) {
			char c = str.charAt(i);
			
			characterCount.compute(c, (k,v)-> (v==null)?1:++v);
		}
		
		return characterCount.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(CountDuplicateCharcters("Hello"));
	}
}

