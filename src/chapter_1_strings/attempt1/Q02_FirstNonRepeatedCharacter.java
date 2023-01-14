package chapter_1_strings.attempt1;

import java.util.HashMap;
import java.util.Map;

public class Q02_FirstNonRepeatedCharacter {

	
	/*
	 * Write a program that returns the
first non-repeated character from a given string.
	 */
	
	static Character firstNonRepeatedChar(String str) {
		
		Map<Character,Integer> charCount = new HashMap<>();
		
		for (int i =0; i<str.length();i++) {
			charCount.compute(str.charAt(i), (k,v) -> (v == null)?1:0); // set to 0 if not null
		}
		
		for (int i=0; i<str.length();i++) {
			if (charCount.get(str.charAt(i)) == 1){
				return str.charAt(i);
			} 
		}
		return '!';
	}
	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedChar("hhll")); // !
		System.out.println(firstNonRepeatedChar("hello")); // h
	}
}
