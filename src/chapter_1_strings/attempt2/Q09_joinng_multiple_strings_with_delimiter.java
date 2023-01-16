package chapter_1_strings.attempt2;

import java.util.StringJoiner;

public class Q09_joinng_multiple_strings_with_delimiter {
	
	// write a program that joins the given strings by the
	// given delimiter
	
	static String joinStrings(String[] strings, String delimiter) {
		StringBuilder result = new StringBuilder();
		for (String str: strings) {
			result.append(str).append(delimiter);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String[] strings = {"hi","my", "name", "is", "Shiv"};
		System.out.println(joinStrings(strings, " "));
	}
	

}

class Solution9 {
	
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
	

}
