package chapter_1_strings.attempt2;

import java.util.HashMap;
import java.util.Map;

public class Q05_count_vowels_and_consonants {
	
	// write a program which counts number of constants in string
	
	static Map<String, Integer> countVowelsAndConsonants(String str){
		str = str.replaceAll("[^a-zA-Z]", "");
		Map<String, Integer> characterCount = new HashMap<>();
		characterCount.put("vowels", 0);
		characterCount.put("consonants", 0);
		for (int i=0; i<str.length();i++) {
			String character = str.substring(i,i+1);
			if (character.matches("[aeiouAEIOU]"))
				characterCount.compute("vowels", (k,v)->++v);
			else if (character.matches("[^aeiouAEIOU]"))
				characterCount.compute("consonants", (k,v)->++v);
		}
		return characterCount;
	}
	
	public static void main(String[] args) {
		System.out.println(countVowelsAndConsonants("a")); // v=1
		System.out.println(countVowelsAndConsonants("b")); // c=1
		System.out.println(countVowelsAndConsonants("ab")); // c=1, v=1
		System.out.println(countVowelsAndConsonants("1")); // c=0,v=0
		System.out.println(countVowelsAndConsonants("1e")); // c=0,v=1
	}
}
