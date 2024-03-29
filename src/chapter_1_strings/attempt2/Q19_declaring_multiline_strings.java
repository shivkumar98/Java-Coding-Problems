package chapter_1_strings.attempt2;

public class Q19_declaring_multiline_strings {
	
	// write a program which declares multiline text
	public static void main(String[] args) {
		String multiline = "this is line 1\nthis is line 2";
		System.out.println(multiline);
	}

}

class Solution19 {
	// in Java 13 we can use triple quotations
	public static void main(String[] args) {
		/// in JDK 8, we can use a Line separator
		// we can use the String's join() method
		String multilineText = String.join(System.lineSeparator(),
				"this is line 1", "my name is shiv", "final line");
		System.out.println(multilineText);
	}
}
