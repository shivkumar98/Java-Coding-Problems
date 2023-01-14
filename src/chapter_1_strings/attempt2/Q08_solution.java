package chapter_1_strings.attempt2;

public class Q08_solution {
	
	// we can use \\s for whitespace
	
	static String removeWhitespaces(String str) {
		return str.replaceAll("\\s", "");
	}
	
	public static void main(String[] args) {
		System.out.println(removeWhitespaces(" ")); // ""
		System.out.println(removeWhitespaces("  h")); // "h"
		System.out.println(removeWhitespaces(" 1 ")); // "1"
		System.out.println(removeWhitespaces("hel    io")); // "helio"
	}

}
