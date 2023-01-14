package chapter_1_strings.attempt2;

import java.util.HashMap;
import java.util.Map;

public class Q01_count_duplicate_chars {
	
	// count duplicate characters:
	// write a program which counts duplicate characters from a string
	static Map<String, Integer> countCharacters(String input){
		Map<String,Integer> characterCount = new HashMap<>();
		String[] splitString = input.split("");
		for (int i=0; i<splitString.length; i++) {
			if (characterCount.containsKey(splitString[i])){
				characterCount.put(splitString[i], characterCount.get(splitString[i])+1);
			} else {
				characterCount.put(splitString[i], 1);
			}
		}
		
		return characterCount;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countCharacters("Shiv")); // {S=1, v=1, h=1, i=1}
		System.out.println(countCharacters("aabbbcccc")); // {a=2, b=3, c=4}

	}

}
