package chapter_1_strings.attempt2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q05_solution {

	private static final Set<Character> allVowels = new HashSet(Arrays.asList('a','e','i','o','u'));
	
	// solution 1: not for Java 8
	/* static Pair<Integer, Integer> countVowelsAndConsonants(String str){
		
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if (allVowels.contains(c)) {
				vowels++;
			}
			else if (c >='a' && c <='z') {
				consonants++;
			}
		}
		
		return Pair.of(vowels, consonants);
	}
	*/
	
}
