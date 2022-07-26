package Chapter_1_Strings;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q05_CountingVowelsAndConstants_Solution {

	/* 5. Counting vowels and consonants: Write a program that counts the
	number of vowels and consonants in a given string. Do this for the English
	language, which has five vowels (a, e, i, o, and u).
	 */
	
	// the book solution first converts to a lower
	// cased string
	// we then check if it's a vowel, elseif its greater than
	// 'a' and less than 'z'
	// it then returns a pair datastructure
	
	public static final Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	
	static Map<String, Integer> countVowelsAndConstansts(String str){
		str = str.toLowerCase();
		Map<String, Integer> vowelsAndConstantsCount = new HashMap<>();

		for (int i =0; i<str.length();i++) {
			char c = str.charAt(i);
			if (vowels.contains(c)) {
				vowelsAndConstantsCount.compute("vowels", (k,v)->(v==null)?1:++v);
			} else if (c>='a' && c<='z') {
				vowelsAndConstantsCount.compute("constants", (k,v)->(v==null)?1:++v);
			} 
		}
		
		System.out.println(vowelsAndConstantsCount);
		return vowelsAndConstantsCount;
		
	}
	
	public static void main(String[] args) {
		countVowelsAndConstansts("Hello world ");
	}
	
}
