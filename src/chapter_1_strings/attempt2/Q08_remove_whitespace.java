package chapter_1_strings.attempt2;

public class Q08_remove_whitespace {
	
	// Q8 write a program which removes all white space from string
	
	static String removeAllWhitespace(String str) {
		return str.replaceAll("[ ]+", "");
	}

	public static void main(String[] args) {
		System.out.println(removeAllWhitespace(" ")); // ""
		System.out.println(removeAllWhitespace("  h")); // "h"
		System.out.println(removeAllWhitespace(" 1 ")); // "1"
		System.out.println(removeAllWhitespace("hel    io")); // "helio"
	}
}

class Solution8 {
	
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
