package chapter_1_strings.attempt2;

import java.util.StringJoiner;

public class Q09_solution {
	
	//  solution 1:
	static String joinByDelimiter(char delimiter, String... args) {
		StringBuilder result = new StringBuilder();
		for (int i=0; i<args.length;i++) {
			result.append(args[i]).append(delimiter);
		}
		return result.toString();
	}
	
	// solution 2:
	// this uses StringJoiner utility class
	static String joinByDelimiter2(char delimiter, String... args) {
		StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
		for (int i=0;i<args.length;i++) {
			joiner.add(args[i]);
		}
		return joiner.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(joinByDelimiter2(' ', "hi","My","name","is","Shiv")); // hi My name is Shiv
	}
	
	

}
