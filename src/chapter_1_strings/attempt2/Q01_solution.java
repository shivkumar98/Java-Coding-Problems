package chapter_1_strings.attempt2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q01_solution {
	
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

	
	public static void main(String[] args) {
		String str = "aabbbccc";
		System.out.println(countDuplicateChars(str)); // {a=1, b=1, c=1}
		System.out.println(countDuplicateChars2(str)); // {a=1, b=1, c=1}

	}
}
