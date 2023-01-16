package chapter_1_strings.attempt2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

class Solution1 {
	// solution 1:
	// this solution relies on the compute function on Maps
	static Map<Character, Integer> countDuplicateChars(String str){
		Map<Character, Integer> result = new HashMap<>();
		for (int i=0;i<str.length();i++) {
			Character c = str.charAt(i);
			result.compute(c, (k,v)-> (v==null)?1:v++);
		}
		return result;
	}
		
	// solution 2:
	// this uses streams
	// 1 calling String.chars returns an intStream
	// 2 transform intStream to characters to convert to character
	// 3 use collect and count them with Collectors.counting
	static Map<Character, Long> countDuplicateChars2(String str){
	return str.chars()
			.mapToObj(i->(char) i)
			.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}
	
}