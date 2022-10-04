package chapter_1_strings;

public class Q23_ApplyingIndentation_Solution {
	// NOTE: this solution only works with JDK 12
	static String days = "Sunday\nMonday\nTuesday";
	public static void main(String[] args) {
		// we can use the in-built indent method:
		System.out.println(days.indent(2));
	}
}
