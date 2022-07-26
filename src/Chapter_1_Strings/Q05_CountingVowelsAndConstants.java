package Chapter_1_Strings;

import java.util.HashMap;
import java.util.Map;

public class Q05_CountingVowelsAndConstants {

/*
 * 5. Counting vowels and consonants: Write a program that counts the
number of vowels and consonants in a given string. Do this for the English
language, which has five vowels (a, e, i, o, and u).
 */
	
	static Map<String,Integer> countNumberOfVowelsAndConstants(String str) {
		Map<String,Integer> vowelsAndConstantsCount = new HashMap<>();
		vowelsAndConstantsCount.put("vowels", 0);
		vowelsAndConstantsCount.put("constants", 0);
		for (int i=0; i<str.length();i++) {
			if (String.valueOf(str.charAt(i)).matches("[aeiou]")) {
				vowelsAndConstantsCount.compute("vowels", (k,v)->++v);
			} else if (String.valueOf(str.charAt(i)).matches("[qwertypsdfghjklzxcvbnm]")){
				vowelsAndConstantsCount.compute("constants", (k,v)->++v);
			}
		}
		System.out.println(vowelsAndConstantsCount);
		return vowelsAndConstantsCount;
	}
	
	public static void main(String[] args) {
		countNumberOfVowelsAndConstants("hello world!!!"); // {vowels=3, constants=7}
	}
	
}
