package chapter_1_strings.attempt2;

import java.util.regex.Pattern;

public class Q16_solution {
	
	// solution 1:
	// same as my solution!
	static boolean containsSubstring(String text, String substring) {
		return text.contains(substring);
	}
	
	// solution 2:
	// uses indexOf
	static boolean containsSubstring2(String text, String substring) {
		return text.indexOf(substring)!=-1;
	}
	
	// solution 3:
	// uses regex
	static boolean containsSubstring3(String text, String substring) {
		return text.matches(".*"+ Pattern.quote(substring)+ ".*");
	}
	
	public static void main(String[] args) {
		System.out.println(containsSubstring3("hello", "ll"));
		System.out.println(containsSubstring3("hello", "le"));

	}

}
